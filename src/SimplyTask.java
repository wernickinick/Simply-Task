import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimplyTask {
    private static int CategoryButtonClick = 0;
    private static int AddTaskCategory1 = 0;
    public static void main(String [ ] args)
    {
        JFrame main = new JFrame("Simply Task");
        main.setBounds(0,0,800,600);
        main.setResizable(false);
        main.setLocationRelativeTo(null);
        main.setLayout(null);
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel line1 = new JLabel(" ▗▄▄▖▗▄▄▄▖▗▖  ▗▖▗▄▄▖ ▗▖ ▗▖  ▗▖    ▗▄▄▄▖▗▄▖  ▗▄▄▖▗▖ ▗▖");
        JLabel line2 = new JLabel("▐▌     █  ▐▛▚▞▜▌▐▌ ▐▌▐▌  ▝▚▞▘       █ ▐▌ ▐▌▐▌   ▐▌▗▞▘");
        JLabel line3 = new JLabel(" ▝▀▚▖  █  ▐▌  ▐▌▐▛▀▘ ▐▌   ▐▌        █ ▐▛▀▜▌ ▝▀▚▖▐▛▚▖ ");
        JLabel line4 = new JLabel("▗▄▄▞▘▗▄█▄▖▐▌  ▐▌▐▌   ▐▙▄▄▖▐▌        █ ▐▌ ▐▌▗▄▄▞▘▐▌ ▐▌");

        line1.setFont(new Font("MonoSpaced", Font.PLAIN,16));
        line2.setFont(new Font("MonoSpaced", Font.PLAIN,16));
        line3.setFont(new Font("MonoSpaced", Font.PLAIN,16));
        line4.setFont(new Font("MonoSpaced", Font.PLAIN,16));

        line1.setVisible(true);
        line2.setVisible(true);
        line3.setVisible(true);
        line4.setVisible(true);

        line1.setBounds(240,0,600,20);
        line2.setBounds(240,15,600,20);
        line3.setBounds(240,30,600,20);
        line4.setBounds(240,45,600,20);

        main.add(line1);
        main.add(line2);
        main.add(line3);
        main.add(line4);

        String PcArt = "            ________________________________________________\n" +
                "            /                                                \\\n" +
                "           |    _________________________________________     |\n" +
                "           |   |                                         |    |\n" +
                "           |   |                SIMPLY TASK              |    |\n" +
                "           |   |  CATEGORY                               |    |\n" +
                "           |   |                                         |    |\n" +
                "           |   |  [ADD TASK]                             |    |\n" +
                "           |   |               [] ------                 |    |\n" +
                "           |   |               [] --------               |    |\n" +
                "           |   |               [] -----                  |    |\n" +
                "           |   |               [] ------                 |    |\n" +
                "           |   |               [] ---                    |    |\n" +
                "           |   |                                         |    |\n" +
                "           |   |                                         |    |\n" +
                "           |   |                                         |    |\n" +
                "           |   |_________________________________________|    |\n" +
                "           |                                                  |\n" +
                "            \\_________________________________________________/\n" +
                "                   \\___________________________________/\n" +
                "                ___________________________________________\n" +
                "             _-'    .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.  --- `-_\n" +
                "          _-'.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.  .-.-.`-_\n" +
                "       _-'.-.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-`__`. .-.-.-.`-_\n" +
                "    _-'.-.-.-.-. .-----.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-----. .-.-.-.-.`-_\n" +
                " _-'.-.-.-.-.-. .---.-. .-------------------------. .-.---. .---.-.-.-.`-_\n" +
                ":-------------------------------------------------------------------------:\n" +
                "`---._.-------------------------------------------------------------._.---'";
        JLabel Art = new JLabel("<html><pre>" + PcArt + "</pre></html>");
        Art.setFont(new Font("MonoSpaced", Font.PLAIN,12));
        Art.setVisible(true);
        Art.setBounds(240,20,800,600);
        main.add(Art);

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

        JPanel Category1Panel = new JPanel();
        Category1Panel.setBounds(0,0,800,600);
        Category1Panel.setBackground(Color.lightGray);
        Category1Panel.setLayout(null);
        Category1Panel.setVisible(false);
        main.add(Category1Panel);

        JPanel Category2Panel = new JPanel();
        Category2Panel.setBounds(0,0,800,600);
        Category2Panel.setBackground(Color.lightGray);
        Category2Panel.setLayout(null);
        Category2Panel.setVisible(false);
        main.add(Category2Panel);

        JPanel Category3Panel = new JPanel();
        Category3Panel.setBounds(0,0,800,600);
        Category3Panel.setBackground(Color.lightGray);
        Category3Panel.setLayout(null);
        Category3Panel.setVisible(false);
        main.add(Category3Panel);

        JPanel Category4Panel = new JPanel();
        Category4Panel.setBounds(0,0,800,600);
        Category4Panel.setBackground(Color.lightGray);
        Category4Panel.setLayout(null);
        Category4Panel.setVisible(false);
        main.add(Category4Panel);

        JPanel Category5Panel = new JPanel();
        Category5Panel.setBounds(0,0,800,600);
        Category5Panel.setBackground(Color.lightGray);
        Category5Panel.setLayout(null);
        Category5Panel.setVisible(false);
        main.add(Category5Panel);

        JPanel Category6Panel = new JPanel();
        Category6Panel.setBounds(0,0,800,600);
        Category6Panel.setBackground(Color.lightGray);
        Category6Panel.setLayout(null);
        Category6Panel.setVisible(false);
        main.add(Category6Panel);

        JPanel Category7Panel = new JPanel();
        Category7Panel.setBounds(0,0,800,600);
        Category7Panel.setBackground(Color.lightGray);
        Category7Panel.setLayout(null);
        Category7Panel.setVisible(false);
        main.add(Category7Panel);

        JButton Category1Return = new JButton("Back");
        Category1Return.setBounds(25,30,100,50);
        Category1Panel.add(Category1Return);

        JButton Category2Return = new JButton("Back");
        Category2Return.setBounds(25,30,100,50);
        Category2Panel.add(Category2Return);

        JButton Category3Return = new JButton("Back");
        Category3Return.setBounds(25,30,100,50);
        Category3Panel.add(Category3Return);

        JButton Category4Return = new JButton("Back");
        Category4Return.setBounds(25,30,100,50);
        Category4Panel.add(Category4Return);

        JButton Category5Return = new JButton("Back");
        Category5Return.setBounds(25,30,100,50);
        Category5Panel.add(Category5Return);

        JButton Category6Return = new JButton("Back");
        Category6Return.setBounds(25,30,100,50);
        Category6Panel.add(Category6Return);

        JButton Category7Return = new JButton("Back");
        Category7Return.setBounds(25,30,100,50);
        Category7Panel.add(Category7Return);

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

        JLabel Category1Label = new JLabel("",SwingConstants.CENTER);
        Category1Label.setFont(new Font("Klose Slab",Font.BOLD,35));
        Category1Label.setBounds(260,0,300,100);
        Category1Label.setVisible(true);
        Category1Panel.add(Category1Label);

        JLabel Category2Label = new JLabel("",SwingConstants.CENTER);
        Category2Label.setFont(new Font("Klose Slab",Font.BOLD,35));
        Category2Label.setBounds(260,0,300,100);
        Category2Label.setVisible(true);
        Category2Panel.add(Category2Label);

        JLabel Category3Label = new JLabel("",SwingConstants.CENTER);
        Category3Label.setFont(new Font("Klose Slab",Font.BOLD,35));
        Category3Label.setBounds(260,0,300,100);
        Category3Label.setVisible(true);
        Category3Panel.add(Category3Label);

        JLabel Category4Label = new JLabel("",SwingConstants.CENTER);
        Category4Label.setFont(new Font("Klose Slab",Font.BOLD,35));
        Category4Label.setBounds(260,0,300,100);
        Category4Label.setVisible(true);
        Category4Panel.add(Category4Label);

        JLabel Category5Label = new JLabel("",SwingConstants.CENTER);
        Category5Label.setFont(new Font("Klose Slab",Font.BOLD,35));
        Category5Label.setBounds(260,0,300,100);
        Category5Label.setVisible(true);
        Category5Panel.add(Category5Label);

        JLabel Category6Label = new JLabel("",SwingConstants.CENTER);
        Category6Label.setFont(new Font("Klose Slab",Font.BOLD,35));
        Category6Label.setBounds(260,0,300,100);
        Category6Label.setVisible(true);
        Category6Panel.add(Category6Label);

        JLabel Category7Label = new JLabel("",SwingConstants.CENTER);
        Category7Label.setFont(new Font("Klose Slab",Font.BOLD,35));
        Category7Label.setBounds(260,0,300,100);
        Category7Label.setVisible(true);
        Category7Panel.add(Category7Label);

        JButton Category1AddTask = new JButton("Add Task");
        Category1AddTask.setBounds(675,30,100,50);
        Category1Panel.add(Category1AddTask);

        JCheckBox Category1Task1 = new JCheckBox("");
        Category1Task1.setBounds(50,100,400,30);
        Category1Panel.add(Category1Task1);
        Category1Task1.setVisible(false);

        JCheckBox Category1Task2 = new JCheckBox("");
        Category1Task2.setBounds(50,130,400,30);
        Category1Panel.add(Category1Task2);
        Category1Task2.setVisible(false);

        JCheckBox Category1Task3 = new JCheckBox("");
        Category1Task3.setBounds(50,160,400,30);
        Category1Panel.add(Category1Task3);
        Category1Task3.setVisible(false);

        JCheckBox Category1Task4 = new JCheckBox("");
        Category1Task4.setBounds(50,190,400,30);
        Category1Panel.add(Category1Task4);
        Category1Task4.setVisible(false);

        JCheckBox Category1Task5 = new JCheckBox("");
        Category1Task5.setBounds(50,220,400,30);
        Category1Panel.add(Category1Task5);
        Category1Task5.setVisible(false);

        JFrame Category1TaskWindow = new JFrame("Add Task");
        Category1TaskWindow.setBounds(0,0,400,300);
        Category1TaskWindow.setResizable(false);
        Category1TaskWindow.setLocationRelativeTo(null);
        Category1TaskWindow.setLayout(null);

        JTextField Category1TaskTextField = new JTextField();
        Category1TaskTextField.setBounds(100,20,200,50);
        Category1TaskWindow.add(Category1TaskTextField);



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

        Category1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryPanel.setVisible(false);
                Category1Panel.setVisible(true);
                Category1Label.setText(Category1.getText());
                main.remove(line1);
                main.remove(line2);
                main.remove(line3);
                main.remove(line4);
                main.remove(Art);
            }
        });

        Category1Return.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryPanel.setVisible(true);
                Category1Panel.setVisible(false);
                main.add(line1);
                main.add(line2);
                main.add(line3);
                main.add(line4);
                main.add(Art);
            }
        });

        Category2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryPanel.setVisible(false);
                Category2Panel.setVisible(true);
                Category2Label.setText(Category2.getText());
                main.remove(line1);
                main.remove(line2);
                main.remove(line3);
                main.remove(line4);
                main.remove(Art);
            }
        });

        Category2Return.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryPanel.setVisible(true);
                Category2Panel.setVisible(false);
                main.add(line1);
                main.add(line2);
                main.add(line3);
                main.add(line4);
                main.add(Art);
            }
        });

        Category3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryPanel.setVisible(false);
                Category3Panel.setVisible(true);
                Category3Label.setText(Category3.getText());
                main.remove(line1);
                main.remove(line2);
                main.remove(line3);
                main.remove(line4);
                main.remove(Art);
            }
        });

        Category3Return.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryPanel.setVisible(true);
                Category3Panel.setVisible(false);
                main.add(line1);
                main.add(line2);
                main.add(line3);
                main.add(line4);
                main.add(Art);
            }
        });

        Category4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryPanel.setVisible(false);
                Category4Panel.setVisible(true);
                Category4Label.setText(Category4.getText());
                main.remove(line1);
                main.remove(line2);
                main.remove(line3);
                main.remove(line4);
                main.remove(Art);
            }
        });

        Category4Return.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryPanel.setVisible(true);
                Category4Panel.setVisible(false);
                main.add(line1);
                main.add(line2);
                main.add(line3);
                main.add(line4);
                main.add(Art);
            }
        });

        Category5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryPanel.setVisible(false);
                Category5Panel.setVisible(true);
                Category5Label.setText(Category5.getText());
                main.remove(line1);
                main.remove(line2);
                main.remove(line3);
                main.remove(line4);
                main.remove(Art);
            }
        });

        Category5Return.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryPanel.setVisible(true);
                Category5Panel.setVisible(false);
                main.add(line1);
                main.add(line2);
                main.add(line3);
                main.add(line4);
                main.add(Art);
            }
        });

        Category6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryPanel.setVisible(false);
                Category6Panel.setVisible(true);
                Category6Label.setText(Category6.getText());
                main.remove(line1);
                main.remove(line2);
                main.remove(line3);
                main.remove(line4);
                main.remove(Art);
            }
        });

        Category6Return.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryPanel.setVisible(true);
                Category6Panel.setVisible(false);
                main.add(line1);
                main.add(line2);
                main.add(line3);
                main.add(line4);
                main.add(Art);
            }
        });

        Category7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryPanel.setVisible(false);
                Category7Panel.setVisible(true);
                Category7Label.setText(Category7.getText());
                main.remove(line1);
                main.remove(line2);
                main.remove(line3);
                main.remove(line4);
                main.remove(Art);
            }
        });

        Category7Return.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategoryPanel.setVisible(true);
                Category7Panel.setVisible(false);
                main.add(line1);
                main.add(line2);
                main.add(line3);
                main.add(line4);
                main.add(Art);
            }
        });

        Category1AddTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Opens jframe with text box and and can name first category
                Category1TaskWindow.setVisible(true);
                //make sure to add a a button to add the jframe and to assign the int count and the string to set text
            }
        });
        main.setVisible(true);
    }
}
