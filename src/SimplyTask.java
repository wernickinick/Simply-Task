import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimplyTask {
    private static int CategoryButtonClick = 0;
    private static int AddTaskCategory1 = 0;
    private static int AddTaskCategory2 = 0;
    private static int AddTaskCategory3 = 0;
    private static int AddTaskCategory4 = 0;
    private static int AddTaskCategory5 = 0;
    private static int AddTaskCategory6 = 0;
    private static int AddTaskCategory7 = 0;
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
                "           |   |           BY NICHOLAS WERNICKI          |    |\n" +
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
        CategoryPanel.setBackground(Color.LIGHT_GRAY);
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
//Category 1 Adding Task Feature
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

        JButton AddingCategory1TaskButton = new JButton("Add Task");
        AddingCategory1TaskButton.setFont(new Font("Klose Slab",Font.BOLD,15));
        AddingCategory1TaskButton.setBounds(130,130,150,50);
        Category1TaskWindow.add(AddingCategory1TaskButton);
//Category 1  Add Task End of Feature

//Category 2 Add Task Feature
        JButton Category2AddTask = new JButton("Add Task");
        Category2AddTask.setBounds(675,30,100,50);
        Category2Panel.add(Category2AddTask);

        JCheckBox Category2Task1 = new JCheckBox("");
        Category2Task1.setBounds(50,100,400,30);
        Category2Panel.add(Category2Task1);
        Category2Task1.setVisible(false);

        JCheckBox Category2Task2 = new JCheckBox("");
        Category2Task2.setBounds(50,130,400,30);
        Category2Panel.add(Category2Task2);
        Category2Task2.setVisible(false);

        JCheckBox Category2Task3 = new JCheckBox("");
        Category2Task3.setBounds(50,160,400,30);
        Category2Panel.add(Category2Task3);
        Category2Task3.setVisible(false);

        JCheckBox Category2Task4 = new JCheckBox("");
        Category2Task4.setBounds(50,190,400,30);
        Category2Panel.add(Category2Task4);
        Category2Task4.setVisible(false);

        JCheckBox Category2Task5 = new JCheckBox("");
        Category2Task5.setBounds(50,220,400,30);
        Category2Panel.add(Category2Task5);
        Category2Task5.setVisible(false);

        JFrame Category2TaskWindow = new JFrame("Add Task");
        Category2TaskWindow.setBounds(0,0,400,300);
        Category2TaskWindow.setResizable(false);
        Category2TaskWindow.setLocationRelativeTo(null);
        Category2TaskWindow.setLayout(null);

        JTextField Category2TaskTextField = new JTextField();
        Category2TaskTextField.setBounds(100,20,200,50);
        Category2TaskWindow.add(Category2TaskTextField);

        JButton AddingCategory2TaskButton = new JButton("Add Task");
        AddingCategory2TaskButton.setFont(new Font("Klose Slab",Font.BOLD,15));
        AddingCategory2TaskButton.setBounds(130,130,150,50);
        Category2TaskWindow.add(AddingCategory2TaskButton);
//Category 2 Add Task Feature End

//Category 3 Add Task Feature
        JButton Category3AddTask = new JButton("Add Task");
        Category3AddTask.setBounds(675,30,100,50);
        Category3Panel.add(Category3AddTask);

        JCheckBox Category3Task1 = new JCheckBox("");
        Category3Task1.setBounds(50,100,400,30);
        Category3Panel.add(Category3Task1);
        Category3Task1.setVisible(false);

        JCheckBox Category3Task2 = new JCheckBox("");
        Category3Task2.setBounds(50,130,400,30);
        Category3Panel.add(Category3Task2);
        Category3Task2.setVisible(false);

        JCheckBox Category3Task3 = new JCheckBox("");
        Category3Task3.setBounds(50,160,400,30);
        Category3Panel.add(Category3Task3);
        Category3Task3.setVisible(false);

        JCheckBox Category3Task4 = new JCheckBox("");
        Category3Task4.setBounds(50,190,400,30);
        Category3Panel.add(Category3Task4);
        Category3Task4.setVisible(false);

        JCheckBox Category3Task5 = new JCheckBox("");
        Category3Task5.setBounds(50,220,400,30);
        Category3Panel.add(Category3Task5);
        Category3Task5.setVisible(false);

        JFrame Category3TaskWindow = new JFrame("Add Task");
        Category3TaskWindow.setBounds(0,0,400,300);
        Category3TaskWindow.setResizable(false);
        Category3TaskWindow.setLocationRelativeTo(null);
        Category3TaskWindow.setLayout(null);

        JTextField Category3TaskTextField = new JTextField();
        Category3TaskTextField.setBounds(100,20,200,50);
        Category3TaskWindow.add(Category3TaskTextField);

        JButton AddingCategory3TaskButton = new JButton("Add Task");
        AddingCategory3TaskButton.setFont(new Font("Klose Slab",Font.BOLD,15));
        AddingCategory3TaskButton.setBounds(130,130,150,50);
        Category3TaskWindow.add(AddingCategory3TaskButton);
//Category 3 Add Task Feature End

//Category 4 Add Task Feature
        JButton Category4AddTask = new JButton("Add Task");
        Category4AddTask.setBounds(675,30,100,50);
        Category4Panel.add(Category4AddTask);

        JCheckBox Category4Task1 = new JCheckBox("");
        Category4Task1.setBounds(50,100,400,30);
        Category4Panel.add(Category4Task1);
        Category4Task1.setVisible(false);

        JCheckBox Category4Task2 = new JCheckBox("");
        Category4Task2.setBounds(50,130,400,30);
        Category4Panel.add(Category4Task2);
        Category4Task2.setVisible(false);

        JCheckBox Category4Task3 = new JCheckBox("");
        Category4Task3.setBounds(50,160,400,30);
        Category4Panel.add(Category4Task3);
        Category4Task3.setVisible(false);

        JCheckBox Category4Task4 = new JCheckBox("");
        Category4Task4.setBounds(50,190,400,30);
        Category4Panel.add(Category4Task4);
        Category4Task4.setVisible(false);

        JCheckBox Category4Task5 = new JCheckBox("");
        Category4Task5.setBounds(50,220,400,30);
        Category4Panel.add(Category4Task5);
        Category4Task5.setVisible(false);

        JFrame Category4TaskWindow = new JFrame("Add Task");
        Category4TaskWindow.setBounds(0,0,400,300);
        Category4TaskWindow.setResizable(false);
        Category4TaskWindow.setLocationRelativeTo(null);
        Category4TaskWindow.setLayout(null);

        JTextField Category4TaskTextField = new JTextField();
        Category4TaskTextField.setBounds(100,20,200,50);
        Category4TaskWindow.add(Category4TaskTextField);

        JButton AddingCategory4TaskButton = new JButton("Add Task");
        AddingCategory4TaskButton.setFont(new Font("Klose Slab",Font.BOLD,15));
        AddingCategory4TaskButton.setBounds(130,130,150,50);
        Category4TaskWindow.add(AddingCategory4TaskButton);
//Category 4 Add Task Feature End

//Category 5 Add Task Feature
        JButton Category5AddTask = new JButton("Add Task");
        Category5AddTask.setBounds(675,30,100,50);
        Category5Panel.add(Category5AddTask);

        JCheckBox Category5Task1 = new JCheckBox("");
        Category5Task1.setBounds(50,100,400,30);
        Category5Panel.add(Category5Task1);
        Category5Task1.setVisible(false);

        JCheckBox Category5Task2 = new JCheckBox("");
        Category5Task2.setBounds(50,130,400,30);
        Category5Panel.add(Category5Task2);
        Category5Task2.setVisible(false);

        JCheckBox Category5Task3 = new JCheckBox("");
        Category5Task3.setBounds(50,160,400,30);
        Category5Panel.add(Category5Task3);
        Category5Task3.setVisible(false);

        JCheckBox Category5Task4 = new JCheckBox("");
        Category5Task4.setBounds(50,190,400,30);
        Category5Panel.add(Category5Task4);
        Category5Task4.setVisible(false);

        JCheckBox Category5Task5 = new JCheckBox("");
        Category5Task5.setBounds(50,220,400,30);
        Category5Panel.add(Category5Task5);
        Category5Task5.setVisible(false);

        JFrame Category5TaskWindow = new JFrame("Add Task");
        Category5TaskWindow.setBounds(0,0,400,300);
        Category5TaskWindow.setResizable(false);
        Category5TaskWindow.setLocationRelativeTo(null);
        Category5TaskWindow.setLayout(null);

        JTextField Category5TaskTextField = new JTextField();
        Category5TaskTextField.setBounds(100,20,200,50);
        Category5TaskWindow.add(Category5TaskTextField);

        JButton AddingCategory5TaskButton = new JButton("Add Task");
        AddingCategory5TaskButton.setFont(new Font("Klose Slab",Font.BOLD,15));
        AddingCategory5TaskButton.setBounds(130,130,150,50);
        Category5TaskWindow.add(AddingCategory5TaskButton);
//Category 5 Add Task Feature End

//Category 6 Add Task Feature
        JButton Category6AddTask = new JButton("Add Task");
        Category6AddTask.setBounds(675,30,100,50);
        Category6Panel.add(Category6AddTask);

        JCheckBox Category6Task1 = new JCheckBox("");
        Category6Task1.setBounds(50,100,400,30);
        Category6Panel.add(Category6Task1);
        Category6Task1.setVisible(false);

        JCheckBox Category6Task2 = new JCheckBox("");
        Category6Task2.setBounds(50,130,400,30);
        Category6Panel.add(Category6Task2);
        Category6Task2.setVisible(false);

        JCheckBox Category6Task3 = new JCheckBox("");
        Category6Task3.setBounds(50,160,400,30);
        Category6Panel.add(Category6Task3);
        Category6Task3.setVisible(false);

        JCheckBox Category6Task4 = new JCheckBox("");
        Category6Task4.setBounds(50,190,400,30);
        Category6Panel.add(Category6Task4);
        Category6Task4.setVisible(false);

        JCheckBox Category6Task5 = new JCheckBox("");
        Category6Task5.setBounds(50,220,400,30);
        Category6Panel.add(Category6Task5);
        Category6Task5.setVisible(false);

        JFrame Category6TaskWindow = new JFrame("Add Task");
        Category6TaskWindow.setBounds(0,0,400,300);
        Category6TaskWindow.setResizable(false);
        Category6TaskWindow.setLocationRelativeTo(null);
        Category6TaskWindow.setLayout(null);

        JTextField Category6TaskTextField = new JTextField();
        Category6TaskTextField.setBounds(100,20,200,50);
        Category6TaskWindow.add(Category6TaskTextField);

        JButton AddingCategory6TaskButton = new JButton("Add Task");
        AddingCategory6TaskButton.setFont(new Font("Klose Slab",Font.BOLD,15));
        AddingCategory6TaskButton.setBounds(130,130,150,50);
        Category6TaskWindow.add(AddingCategory6TaskButton);
//Category 6 Add Task Feature End

//Category 7 Add Task Feature
        JButton Category7AddTask = new JButton("Add Task");
        Category7AddTask.setBounds(675,30,100,50);
        Category7Panel.add(Category7AddTask);

        JCheckBox Category7Task1 = new JCheckBox("");
        Category7Task1.setBounds(50,100,400,30);
        Category7Panel.add(Category7Task1);
        Category7Task1.setVisible(false);

        JCheckBox Category7Task2 = new JCheckBox("");
        Category7Task2.setBounds(50,130,400,30);
        Category7Panel.add(Category7Task2);
        Category7Task2.setVisible(false);

        JCheckBox Category7Task3 = new JCheckBox("");
        Category7Task3.setBounds(50,160,400,30);
        Category7Panel.add(Category7Task3);
        Category7Task3.setVisible(false);

        JCheckBox Category7Task4 = new JCheckBox("");
        Category7Task4.setBounds(50,190,400,30);
        Category7Panel.add(Category7Task4);
        Category7Task4.setVisible(false);

        JCheckBox Category7Task5 = new JCheckBox("");
        Category7Task5.setBounds(50,220,400,30);
        Category7Panel.add(Category7Task5);
        Category7Task5.setVisible(false);

        JFrame Category7TaskWindow = new JFrame("Add Task");
        Category7TaskWindow.setBounds(0,0,400,300);
        Category7TaskWindow.setResizable(false);
        Category7TaskWindow.setLocationRelativeTo(null);
        Category7TaskWindow.setLayout(null);

        JTextField Category7TaskTextField = new JTextField();
        Category7TaskTextField.setBounds(100,20,200,50);
        Category7TaskWindow.add(Category7TaskTextField);

        JButton AddingCategory7TaskButton = new JButton("Add Task");
        AddingCategory7TaskButton.setFont(new Font("Klose Slab",Font.BOLD,15));
        AddingCategory7TaskButton.setBounds(130,130,150,50);
        Category7TaskWindow.add(AddingCategory7TaskButton);
//Category 7 Add Task Feature End

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
            }
        });

        AddingCategory1TaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddTaskCategory1++;
                String Category1Tasks = Category1TaskTextField.getText();
                if(AddTaskCategory1 == 1)
                {
                    Category1Task1.setVisible(true);
                    Category1Task1.setText(Category1Tasks);
                    Category1TaskWindow.dispose();
                    Category1TaskTextField.setText("");
                }
                if(AddTaskCategory1 == 2)
                {
                    Category1Task2.setVisible(true);
                    Category1Task2.setText(Category1Tasks);
                    Category1TaskWindow.dispose();
                    Category1TaskTextField.setText("");
                }
                if(AddTaskCategory1 == 3)
                {
                    Category1Task3.setVisible(true);
                    Category1Task3.setText(Category1Tasks);
                    Category1TaskWindow.dispose();
                    Category1TaskTextField.setText("");
                }
                if(AddTaskCategory1 == 4)
                {
                    Category1Task4.setVisible(true);
                    Category1Task4.setText(Category1Tasks);
                    Category1TaskWindow.dispose();
                    Category1TaskTextField.setText("");
                }
                if(AddTaskCategory1 == 5)
                {
                    Category1Task5.setVisible(true);
                    Category1Task5.setText(Category1Tasks);
                    Category1TaskWindow.dispose();
                    Category1TaskTextField.setText("");
                }
            }
        });

        Category2AddTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Category2TaskWindow.setVisible(true);
            }
        });

        AddingCategory2TaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddTaskCategory2++;
                String Category2Tasks = Category2TaskTextField.getText();
                if(AddTaskCategory2 == 1)
                {
                    Category2Task1.setVisible(true);
                    Category2Task1.setText(Category2Tasks);
                    Category2TaskWindow.dispose();
                    Category2TaskTextField.setText("");
                }
                if(AddTaskCategory2 == 2)
                {
                    Category2Task2.setVisible(true);
                    Category2Task2.setText(Category2Tasks);
                    Category2TaskWindow.dispose();
                    Category2TaskTextField.setText("");
                }
                if(AddTaskCategory2 == 3)
                {
                    Category2Task3.setVisible(true);
                    Category2Task3.setText(Category2Tasks);
                    Category2TaskWindow.dispose();
                    Category2TaskTextField.setText("");
                }
                if(AddTaskCategory2 == 4)
                {
                    Category2Task4.setVisible(true);
                    Category2Task4.setText(Category2Tasks);
                    Category2TaskWindow.dispose();
                    Category2TaskTextField.setText("");
                }
                if(AddTaskCategory2 == 5)
                {
                    Category2Task5.setVisible(true);
                    Category2Task5.setText(Category2Tasks);
                    Category2TaskWindow.dispose();
                    Category2TaskTextField.setText("");
                }
            }
        });

        Category3AddTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Category3TaskWindow.setVisible(true);
            }
        });

        AddingCategory3TaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddTaskCategory3++;
                String Category3Tasks = Category3TaskTextField.getText();
                if(AddTaskCategory3 == 1)
                {
                    Category3Task1.setVisible(true);
                    Category3Task1.setText(Category3Tasks);
                    Category3TaskWindow.dispose();
                    Category3TaskTextField.setText("");
                }
                if(AddTaskCategory3 == 2)
                {
                    Category3Task2.setVisible(true);
                    Category3Task2.setText(Category3Tasks);
                    Category3TaskWindow.dispose();
                    Category3TaskTextField.setText("");
                }
                if(AddTaskCategory3 == 3)
                {
                    Category3Task3.setVisible(true);
                    Category3Task3.setText(Category3Tasks);
                    Category3TaskWindow.dispose();
                    Category3TaskTextField.setText("");
                }
                if(AddTaskCategory3 == 4)
                {
                    Category3Task4.setVisible(true);
                    Category3Task4.setText(Category3Tasks);
                    Category3TaskWindow.dispose();
                    Category3TaskTextField.setText("");
                }
                if(AddTaskCategory3 == 5)
                {
                    Category3Task5.setVisible(true);
                    Category3Task5.setText(Category3Tasks);
                    Category3TaskWindow.dispose();
                    Category3TaskTextField.setText("");
                }
            }
        });

        Category4AddTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Category4TaskWindow.setVisible(true);
            }
        });

        AddingCategory4TaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddTaskCategory4++;
                String Category4Tasks = Category4TaskTextField.getText();
                if(AddTaskCategory4 == 1)
                {
                    Category4Task1.setVisible(true);
                    Category4Task1.setText(Category4Tasks);
                    Category4TaskWindow.dispose();
                    Category4TaskTextField.setText("");
                }
                if(AddTaskCategory4 == 2)
                {
                    Category4Task2.setVisible(true);
                    Category4Task2.setText(Category4Tasks);
                    Category4TaskWindow.dispose();
                    Category4TaskTextField.setText("");
                }
                if(AddTaskCategory4 == 3)
                {
                    Category4Task3.setVisible(true);
                    Category4Task3.setText(Category4Tasks);
                    Category4TaskWindow.dispose();
                    Category4TaskTextField.setText("");
                }
                if(AddTaskCategory4 == 4)
                {
                    Category4Task4.setVisible(true);
                    Category4Task4.setText(Category4Tasks);
                    Category4TaskWindow.dispose();
                    Category4TaskTextField.setText("");
                }
                if(AddTaskCategory4 == 5)
                {
                    Category4Task5.setVisible(true);
                    Category4Task5.setText(Category4Tasks);
                    Category4TaskWindow.dispose();
                    Category4TaskTextField.setText("");
                }
            }
        });

        Category5AddTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Category5TaskWindow.setVisible(true);
            }
        });

        AddingCategory5TaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddTaskCategory5++;
                String Category5Tasks = Category5TaskTextField.getText();
                if(AddTaskCategory5 == 1)
                {
                    Category5Task1.setVisible(true);
                    Category5Task1.setText(Category5Tasks);
                    Category5TaskWindow.dispose();
                    Category5TaskTextField.setText("");
                }
                if(AddTaskCategory5 == 2)
                {
                    Category5Task2.setVisible(true);
                    Category5Task2.setText(Category5Tasks);
                    Category5TaskWindow.dispose();
                    Category5TaskTextField.setText("");
                }
                if(AddTaskCategory5 == 3)
                {
                    Category5Task3.setVisible(true);
                    Category5Task3.setText(Category5Tasks);
                    Category5TaskWindow.dispose();
                    Category5TaskTextField.setText("");
                }
                if(AddTaskCategory5 == 4)
                {
                    Category5Task4.setVisible(true);
                    Category5Task4.setText(Category5Tasks);
                    Category5TaskWindow.dispose();
                    Category5TaskTextField.setText("");
                }
                if(AddTaskCategory5 == 5)
                {
                    Category5Task5.setVisible(true);
                    Category5Task5.setText(Category5Tasks);
                    Category5TaskWindow.dispose();
                    Category5TaskTextField.setText("");
                }
            }
        });

        Category6AddTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Category6TaskWindow.setVisible(true);
            }
        });

        AddingCategory6TaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddTaskCategory6++;
                String Category6Tasks = Category6TaskTextField.getText();
                if(AddTaskCategory6 == 1)
                {
                    Category6Task1.setVisible(true);
                    Category6Task1.setText(Category6Tasks);
                    Category6TaskWindow.dispose();
                    Category6TaskTextField.setText("");
                }
                if(AddTaskCategory6 == 2)
                {
                    Category6Task2.setVisible(true);
                    Category6Task2.setText(Category6Tasks);
                    Category6TaskWindow.dispose();
                    Category6TaskTextField.setText("");
                }
                if(AddTaskCategory6 == 3)
                {
                    Category6Task3.setVisible(true);
                    Category6Task3.setText(Category6Tasks);
                    Category6TaskWindow.dispose();
                    Category6TaskTextField.setText("");
                }
                if(AddTaskCategory6 == 4)
                {
                    Category6Task4.setVisible(true);
                    Category6Task4.setText(Category6Tasks);
                    Category6TaskWindow.dispose();
                    Category6TaskTextField.setText("");
                }
                if(AddTaskCategory6 == 5)
                {
                    Category6Task5.setVisible(true);
                    Category6Task5.setText(Category6Tasks);
                    Category6TaskWindow.dispose();
                    Category6TaskTextField.setText("");
                }
            }
        });

        Category7AddTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Category7TaskWindow.setVisible(true);
            }
        });

        AddingCategory7TaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddTaskCategory7++;
                String Category7Tasks = Category7TaskTextField.getText();
                if(AddTaskCategory7 == 1)
                {
                    Category7Task1.setVisible(true);
                    Category7Task1.setText(Category7Tasks);
                    Category7TaskWindow.dispose();
                    Category7TaskTextField.setText("");
                }
                if(AddTaskCategory7 == 2)
                {
                    Category7Task2.setVisible(true);
                    Category7Task2.setText(Category7Tasks);
                    Category7TaskWindow.dispose();
                    Category7TaskTextField.setText("");
                }
                if(AddTaskCategory7 == 3)
                {
                    Category7Task3.setVisible(true);
                    Category7Task3.setText(Category7Tasks);
                    Category7TaskWindow.dispose();
                    Category7TaskTextField.setText("");
                }
                if(AddTaskCategory7 == 4)
                {
                    Category7Task4.setVisible(true);
                    Category7Task4.setText(Category7Tasks);
                    Category7TaskWindow.dispose();
                    Category7TaskTextField.setText("");
                }
                if(AddTaskCategory7 == 5)
                {
                    Category7Task5.setVisible(true);
                    Category7Task5.setText(Category7Tasks);
                    Category7TaskWindow.dispose();
                    Category7TaskTextField.setText("");
                }
            }
        });
        main.setVisible(true);
    }
}
