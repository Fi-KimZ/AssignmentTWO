import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {
    JRadioButton birdBtn, catBtn, dogBtn, rabbitBtn, pigBtn;
    ButtonGroup group;
    JButton showBtn;
    JLabel imageLabel;

      public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Radio button
        birdBtn = new JRadioButton("Bird");
        catBtn = new JRadioButton("Cat");
        dogBtn = new JRadioButton("Dog");
        rabbitBtn = new JRadioButton("Rabbit");
        pigBtn = new JRadioButton("Pig");

        group = new ButtonGroup();
        group.add(birdBtn);
        group.add(catBtn);
        group.add(dogBtn);
        group.add(rabbitBtn);
        group.add(pigBtn);

        // Add radio buttons to frame
        add(birdBtn);
        add(catBtn);
        add(dogBtn);
        add(rabbitBtn);
        add(pigBtn);

        // Show Selection Button
        showBtn = new JButton("Show Selection");
        showBtn.addActionListener(this);
        add(showBtn);

        // Label for image (optional)
        imageLabel = new JLabel();
        add(imageLabel);

        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        String selectedPet = " ";

        if (birdBtn.isSelected()) selectedPet = "Bird";
        else if (catBtn.isSelected()) selectedPet = "Cat";
        else if (dogBtn.isSelected()) selectedPet = "Dog";
        else if (rabbitBtn.isSelected()) selectedPet = "Rabbit";
        else if (pigBtn.isSelected()) selectedPet = "Pig";

        if (!selectedPet.isEmpty()) {
            JOptionPane.showMessageDialog(this, "You selected: " + selectedPet);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a pet.");
        }
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
