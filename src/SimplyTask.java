import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimplyTask {
    private static int CategoryButtonClick = 0;
    public static void main(String [ ] args)
    {
        JFrame main = new JFrame("Simply Task");
        main.setBounds(0,0,800,600);
        main.setResizable(false);
        main.setLocationRelativeTo(null);
        main.setLayout(null);
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

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

        JFrame MaxCategories = new JFrame("Max Categories");
        MaxCategories.setBounds(0,0,400,300);
        MaxCategories.setResizable(false);
        MaxCategories.setBackground(Color.red);
        MaxCategories.setLayout(null);
        MaxCategories.setLocationRelativeTo(null);

        JLabel CantAddMoreCategories = new JLabel("Warning! Can't Add More Categories",SwingConstants.CENTER);
        CantAddMoreCategories.setBounds(0,0,400,50);
        CantAddMoreCategories.setFont(new Font("Klose Slab",Font.BOLD,20));
        CantAddMoreCategories.setForeground(Color.red);
        CantAddMoreCategories.setVisible(true);
        MaxCategories.add(CantAddMoreCategories);

        JTextField AddingCategoryText = new JTextField();
        AddingCategoryText.setBounds(100,20,200,50);
        AddingCategory.add(AddingCategoryText);

        JButton AddingCategoryButton = new JButton("ADD CATEGORY");
        AddingCategoryButton.setFont(new Font("Klose Slab",Font.BOLD,15));
        AddingCategoryButton.setBounds(130,130,150,50);
        AddingCategory.add(AddingCategoryButton);

        JButton Category1 = new JButton("");
        Category1.setBounds(25,100,150,50);

        JButton Category2 = new JButton("");
        Category2.setBounds(25,150,150,50);

        JButton Category3 = new JButton("");
        Category3.setBounds(25,200,150,50);

        JButton Category4 = new JButton("");
        Category4.setBounds(25,250,150,50);

        JButton Category5 = new JButton("");
        Category5.setBounds(25,300,150,50);

        JButton Category6 = new JButton("");
        Category6.setBounds(25,350,150,50);

        JButton Category7 = new JButton("");
        Category7.setBounds(25,400,150,50);

        AddCategoriesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddingCategory.setVisible(true);
            }
        });

        AddingCategoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryButtonClick++;
                String Text = AddingCategoryText.getText();
                if(CategoryButtonClick == 1)
                {
                    Category1.setText(Text);
                    CategoryPanel.add(Category1);
                    AddingCategory.dispose();
                    AddingCategoryText.setText("");
                }
                if(CategoryButtonClick == 2)
                {
                    Category2.setText(Text);
                    CategoryPanel.add(Category2);
                    AddingCategory.dispose();
                    AddingCategoryText.setText("");
                }
                if(CategoryButtonClick == 3)
                {
                    Category3.setText(Text);
                    CategoryPanel.add(Category3);
                    AddingCategory.dispose();
                    AddingCategoryText.setText("");
                }
                if(CategoryButtonClick == 4)
                {
                    Category4.setText(Text);
                    CategoryPanel.add(Category4);
                    AddingCategory.dispose();
                    AddingCategoryText.setText("");
                }
                if(CategoryButtonClick == 5)
                {
                    Category5.setText(Text);
                    CategoryPanel.add(Category5);
                    AddingCategory.dispose();
                    AddingCategoryText.setText("");
                }
                if(CategoryButtonClick == 6)
                {
                    Category6.setText(Text);
                    CategoryPanel.add(Category6);
                    AddingCategory.dispose();
                    AddingCategoryText.setText("");
                }
                if(CategoryButtonClick == 7)
                {
                    Category7.setText(Text);
                    CategoryPanel.add(Category7);
                    AddingCategory.dispose();
                    AddingCategoryText.setText("");
                }
                if(CategoryButtonClick >= 8)
                {
                    //Add a Jframe that says you cant add more categories
                    MaxCategories.setVisible(true);
                    AddingCategory.dispose();
                }
            }
        });


        main.setVisible(true);
    }
}
