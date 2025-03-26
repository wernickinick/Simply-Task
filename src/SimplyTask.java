import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimplyTask {
    public static void main(String [ ] args)
    {
        int CategoryButtonClick = 0;
        JFrame main = new JFrame("Simply Task");
        main.setBounds(0,0,800,600);
        main.setResizable(false);
        main.setLocationRelativeTo(null);
        main.setLayout(null);

        JPanel CategoryPanel = new JPanel();
        CategoryPanel.setBounds(0,0,200,600);
        CategoryPanel.setBackground(Color.GRAY);
        CategoryPanel.setLayout(null);
        main.add(CategoryPanel);

        JLabel CategoryHeading = new JLabel("Category",SwingConstants.CENTER);
        CategoryHeading.setFont(new Font("Klose Slab",Font.BOLD,35));
        CategoryHeading.setBounds(0,0,200,50);
        CategoryHeading.setForeground(Color.blue);
        CategoryHeading.setVisible(true);
        CategoryPanel.add(CategoryHeading);

        JButton AddCategoriesButton = new JButton("Add");
        AddCategoriesButton.setBounds(25,500,150,50);
        CategoryPanel.add(AddCategoriesButton);

        JFrame AddingCategory = new JFrame("");
        AddingCategory.setBounds(0,0,400,300);
        AddingCategory.setResizable(false);
        AddingCategory.setBackground(Color.cyan);
        AddingCategory.setLayout(null);
        AddingCategory.setLocationRelativeTo(null);

        JTextField AddingCategoryText = new JTextField();
        AddingCategoryText.setBounds(100,20,200,50);
        AddingCategory.add(AddingCategoryText);

            JButton AddingCategoryButton = new JButton("ADD CATEGORY");
        AddingCategoryButton.setFont(new Font("Klose Slab",Font.BOLD,15));
        AddingCategoryButton.setBounds(130,130,150,50);
        AddingCategory.add(AddingCategoryButton);

        AddCategoriesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddingCategory.setVisible(true);
            }
        });


        main.setVisible(true);
    }
}
