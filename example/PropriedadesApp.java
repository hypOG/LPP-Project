package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PropriedadesApp extends JFrame implements ActionListener {

    private JButton listarButton;
    private JButton alugarButton;
    private JButton adicionarButton;
    private JButton descontoButton;
    private List<Propriedade> propriedades;

    public PropriedadesApp() {
        // Configurações da janela principal
        setTitle("Gestão de Propriedades");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Criação dos botões
        listarButton = new JButton("Listar propriedades");
        alugarButton = new JButton("Alugar propriedades");
        adicionarButton = new JButton("Adicionar propriedade");
        descontoButton = new JButton("Aplicar desconto");

        // Adiciona ActionListener aos botões
        listarButton.addActionListener(this);
        alugarButton.addActionListener(this);
        adicionarButton.addActionListener(this);
        descontoButton.addActionListener(this);

        // Configuração do layout e adição dos botões
        setLayout(new GridLayout(4, 1, 10, 10)); // Grid layout com 3 linhas e 1 coluna, com espaçamento de 10px

        add(listarButton);
        add(alugarButton);
        add(adicionarButton);
        add(descontoButton);

        // Inicializa a lista de propriedades
        propriedades = new ArrayList<>();
        // Adiciona algumas propriedades para teste
        propriedades.add( new Casa("Rua das Flores, 123", 250, "Bom", 50, 3, 2, 100, true));
        propriedades.add(new Casa("Avenida Central, 456", 300, "Médio", 75, 4, 3, 150, false));
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Ações a serem realizadas quando os botões são clicados
        if (e.getSource() == listarButton) {
            listarPropriedades();
        } else if (e.getSource() == alugarButton) {
            alugarPropriedades();
        } else if (e.getSource() == adicionarButton) {
            adicionarPropriedade();
        } else if (e.getSource() == descontoButton) {
            aplicarDesconto();
        }
    }

    private void listarPropriedades() {
        // Cria uma string para armazenar os detalhes das propriedades
        StringBuilder detalhes = new StringBuilder();
        for (Propriedade propriedade : propriedades) {
            if (propriedade.verificarDisponibilidade() == true) {
                detalhes.append(propriedade.toString()).append("\n");
            }
        }
        // Exibe os detalhes das propriedades em um JOptionPane
        JOptionPane.showMessageDialog(this, detalhes.toString(), "Lista de Propriedades", JOptionPane.INFORMATION_MESSAGE);
    }

    private void alugarPropriedades() {
        // Create a list of property addresses to display in the dialog
        List<String> propertyAddresses = new ArrayList<>();
        for (Propriedade propriedade : propriedades) {
            if (propriedade.verificarDisponibilidade()) {
                propertyAddresses.add(propriedade.getLocalizacao());
            }
        }

        // Display a dialog to select a property
        String[] options = propertyAddresses.toArray(new String[0]);
        int selectedPropertyIndex = JOptionPane.showOptionDialog(this,
                "Selecione a propriedade para alugar", "Alugar Propriedade",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);

        if (selectedPropertyIndex == -1) {
            return; // If the user cancels the operation
        }

        // Prompt the user to enter the number of nights
        String nightsInput = JOptionPane.showInputDialog(this,
                "Digite o número de noites para alugar:", null);
        if (nightsInput == null) {
            return; // If the user cancels the operation
        }

        int nights = 0;
        try {
            nights = Integer.parseInt(nightsInput);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Número de noites inválido. Por favor, insira um número válido.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get the selected property and update its rental status
        Propriedade selectedProperty = propriedades.get(selectedPropertyIndex);
        selectedProperty.alugarPropriedade();

        JOptionPane.showMessageDialog(this,
                "Propriedade alugada por " + nights + " noites com sucesso!",
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void adicionarPropriedade() {
        // Exemplo simplificado de como adicionar uma nova propriedade
        // Você pode expandir isso para coletar mais detalhes do usuário

        String[] options = {"Casa", "Apartamento", "Cabana", "Chale"};
        int tipoPropriedade = JOptionPane.showOptionDialog(this, "Selecione o tipo de propriedade", "Adicionar Propriedade",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (tipoPropriedade == -1) {
            return; // Se o usuário cancelar a operação
        }

        String localizacao = JOptionPane.showInputDialog(this, "Digite a localização:", null);
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o tamanho (m2):", null));
        String comodidades = JOptionPane.showInputDialog(this, "Estado:", null);
        int preco = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o preço por noite:", null));
        int quartos = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o número de quartos:", null));
        int banheiros = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o número de banheiros:", null));

        Propriedade novaPropriedade = null;

        switch (tipoPropriedade) {
            case 0:
                int areaExterna = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite a área externa (m2):", null));
                boolean piscina = JOptionPane.showConfirmDialog(this, "Tem piscina?", "Piscina", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                novaPropriedade = new Casa(localizacao, tamanho, comodidades, preco, quartos, banheiros, areaExterna, piscina);
                break;
            case 1:
                int andar = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o andar:", null));
                boolean elevador = JOptionPane.showConfirmDialog(this, "Tem elevador?", "Elevador", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                boolean varanda = JOptionPane.showConfirmDialog(this, "Tem varanda?", "Varanda", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                novaPropriedade = new Apartamento(localizacao, tamanho, comodidades, preco, quartos, banheiros, andar, elevador, varanda);
                break;
            case 2:
                boolean temLareira = JOptionPane.showConfirmDialog(this, "Tem lareira?", "Lareira", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                boolean proximaFloresta = JOptionPane.showConfirmDialog(this, "Próxima a floresta?", "Floresta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                novaPropriedade = new Cabana(localizacao, tamanho, comodidades, preco, quartos, banheiros, temLareira, proximaFloresta);
                break;
            case 3:
                boolean aquecimentoCentral = JOptionPane.showConfirmDialog(this, "Tem aquecimento central?", "Aquecimento", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                boolean vistaMontanha = JOptionPane.showConfirmDialog(this, "Vista para montanha?", "Vista", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                novaPropriedade = new Chale(localizacao, tamanho, comodidades, preco, quartos, banheiros, aquecimentoCentral, vistaMontanha);
                break;
        }

        if (novaPropriedade != null) {
            propriedades.add(novaPropriedade);
            JOptionPane.showMessageDialog(this, "Propriedade adicionada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            // Atualiza a exibição dos botões
            this.revalidate(); // Ou this.repaint();
        }
    }

    private void aplicarDesconto() {
        // Create a list of property addresses to display in the dialog
        List<String> propertiesAddresses = new ArrayList<>();
        for (Propriedade propriedade : propriedades) {
            if (propriedade.verificarDisponibilidade()) {
                propertiesAddresses.add(propriedade.getLocalizacao());
            }
        }

        // Display a dialog to select a property
        String[] options = propertiesAddresses.toArray(new String[0]);
        int selectedPropertyIndex = JOptionPane.showOptionDialog(this,
                "Selecione a propriedade para aplicar o desconto", "Aplicar desconto",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);

        if (selectedPropertyIndex == -1) {
            return; // If the user cancels the operation
        }

        // Prompt the user to enter the discount value
        String discountInput = JOptionPane.showInputDialog(this,
                "Digite o valor do desconto (0 a 100%):", null);
        if (discountInput == null) {
            return; // If the user cancels the operation
        }

        int discount = 0;
        try {
            discount = Integer.parseInt(discountInput);
            if (discount < 0 || discount > 100) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Valor de desconto inválido. Por favor, insira um valor entre 0 e 100.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get the selected property and update its rental status
        Propriedade selectedProperty = propriedades.get(selectedPropertyIndex);
        selectedProperty.aplicarDesconto(discount);

        this.revalidate();

        JOptionPane.showMessageDialog(this,
                "Preço da propriedade atualizdo com sucesso!",
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        // Criação e exibição da janela principal
        SwingUtilities.invokeLater(() -> {
            PropriedadesApp app = new PropriedadesApp();
            app.setVisible(true);
        });
    }
}