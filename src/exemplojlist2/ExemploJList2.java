package exemplojlist2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJList2 extends JFrame {

    JList lista;
    String cidades[] = {"Rio de Janeiro", "São Paulo", "Minas Gerais", "Espírito Santo", "Bahia", "Pernambuco", "Rio Grande do Sul", "Acre", "Rio de Janeiro", "São Paulo", "Minas Gerais", "Espírito Santo", "Bahia", "Pernambuco", "Rio Grande do Sul", "Acre", "Rio de Janeiro", "São Paulo", "Minas Gerais", "Espírito Santo", "Bahia", "Pernambuco", "Rio Grande do Sul", "Acre", "Rio de Janeiro", "São Paulo", "Minas Gerais", "Espírito Santo", "Bahia", "Pernambuco", "Rio Grande do Sul", "Acre", "Rio de Janeiro", "São Paulo", "Minas Gerais", "Espírito Santo", "Bahia", "Pernambuco", "Rio Grande do Sul", "Acre", "Rio de Janeiro", "São Paulo", "Minas Gerais", "Espírito Santo", "Bahia", "Pernambuco", "Rio Grande do Sul", "Acre", "Rio de Janeiro", "São Paulo", "Minas Gerais", "Espírito Santo", "Bahia", "Pernambuco", "Rio Grande do Sul", "Acre", "Rio de Janeiro", "São Paulo", "Minas Gerais", "Espírito Santo", "Bahia", "Pernambuco", "Rio Grande do Sul", "Acre", "Rio de Janeiro", "São Paulo", "Minas Gerais", "Espírito Santo", "Bahia", "Pernambuco", "Rio Grande do Sul", "Acre"};
    JButton exibir;

    public ExemploJList2() {
        super("Exemplo de List");
        Container tela = getContentPane();
        setLayout(null);
        exibir = new JButton("Exibir");
        lista = new JList(cidades);
        lista.setVisibleRowCount(5);
        JScrollPane painelRolagem = new JScrollPane(lista);
        lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        painelRolagem.setBounds(40, 50, 150, 100);
        exibir.setBounds(270, 50, 100, 30);
        lista.setFont(new Font("Times New Roman", Font.BOLD, 16));
        exibir.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object selecionados[] = lista.getSelectedValues();
                String resultados = "Valores selecionados:\n";
                for (int i = 0; i < selecionados.length; i++) {
                    resultados += selecionados[i].toString() + "\n";
                }
                JOptionPane.showMessageDialog(null, resultados);
            }
        }
        );
        tela.add(painelRolagem);
        tela.add(exibir);
        setSize(400, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        ExemploJList2 app = new ExemploJList2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
