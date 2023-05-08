/*Team Name: C.A.R.D
Members = Caitlin, David, Adam T, Ryan, Connor
Name of app = StudyBuddy
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class StudyBuddy {
    private JPanel Background;
    private JPanel Welcome;
    private JButton continueBtnWelcome;
    private JTextPane welcomeTxtPane;
    private JPanel Name;
    private JButton backBtnName;
    private JButton NextBtnName;
    private JLabel nameLbl;
    private JTextField forenameTxtField;
    private JTextField surnameTxtField;
    private JPanel DigitalSkillsSoftwareDev;
    private JLabel DigitalSkillsSoftwareLbl;
    private JLabel DigitalSkillsSoftwarePracticalLbl;
    private JButton NextBtnDigSkillsSoftware;
    private JButton backBtnDigSkillsSoftware;
    private JPanel DigitalSkillsCyber;
    private JComboBox DigSkillsSoftwareDevTheory;
    private JComboBox DigSkillsSoftwareDevPrac;
    private JComboBox DigSkillsCyberGrade;
    private JButton BackBtnCyber;
    private JButton NextBtnCyber;
    private JPanel DigSkillsDataScience;
    private JComboBox DigSkillsDataGrade;
    private JLabel DigSkillsDataLbl;
    private JPanel IoT;
    private JPanel NetworkInfrastructure;
    private JPanel ComputerScience;
    private JPanel CloudComputing;
    private JPanel SoftwareDevelopment;
    private JPanel ProfessionalPractice;
    private JPanel Summary;
    private JComboBox compSciGrade;
    private JButton compSciNextButton;
    private JButton compSciBackButton;
    private JComboBox networkTheory;
    private JComboBox networkPractical;
    private JButton networkNextButton;
    private JButton networkBackButton;
    private JButton BackBtnData;
    private JButton NextBtnData;
    private JButton backButtonIoT;
    private JButton nextButtonIoT;
    private JComboBox iotPracticalGrade;
    private JComboBox iotTheoryGrade;
    private JLabel iotPracticalLabel;
    private JLabel iotTheoryLabel;
    private JComboBox SoftDevTheoryGrade;
    private JComboBox SoftDevPracticalGrade;
    private JButton BackBtnSoftDev;
    private JButton NextBtnSoftDev;
    private JComboBox CloudCompTheoryGrade;
    private JButton NextBtnCloud;
    private JButton BackBtnCloud;
    private JButton BackBtnProfPractice;
    private JButton NextBtnProfPractice;
    private JTextPane WelcomeTxtPane;
    private JButton confirmBtnName;
    private JLabel fullNameLbl;
    private JLabel totalDigSkillsSoftware;
    private JLabel DigSkillsSoftwareDevScoreLbl;
    private JButton confirmBtn;
    private JButton confirmBtnDSCS;
    private JLabel dscsLbl;
    private JButton confirmBtnDigSkillsSoftware;
    private JComboBox ProPractGrade;
    private JButton backBtnSummary;
    private JPanel DigitalSkillsComputerScience;
    private JButton nextBtnDigSkillsCompSci;
    private JButton backBtnDigSkillsCompSci;
    private JButton confirmBtnDigSkillsCompSci;
    private JComboBox DigSkillsCompSciGrade;
    private JLabel DigSkillsCompSciLbl;
    private JLabel NetworkLbl;
    private JButton confirmBtnNetworkInfrastructure;
    private JButton confirmBtnDataScience;
    private JButton confirmBtnIoT;
    private JLabel IotLbl;
    private JLabel DataLbl;
    private JButton confirmBtnComputerScience;
    private JButton confirmBtnCloudComputing;
    private JButton confirmBtnProfessionalPractice;
    private JButton confirmBtnSoftwareDevelopment;
    private JLabel compSciLbl;
    private JLabel cloudCompLbl;
    private JLabel softDevLbl;
    private JLabel ProfPracticeLbl;
    private JTextArea SummaryTxtAreaGrades;
    private JTextArea SummaryTxtAreaSubjects;
    private JTextArea SummaryTxtAreaInfo;
    private JButton nextBtnSummary;
    private JPanel Results;
    private JTextArea ResultsTxtAreaInfo;
    private JButton saveBtnResults;
    private JButton backBtnResults;
    private JButton editGradesBtnResults;
    private JTextArea ResultsTxtAreaName;
    private JTextArea ResultsTxtAreaTotal;
    private JTextArea ResultsTxtAreaOnTarget;
    private JTextArea ResultsTxtAreaPassPercentage;
    private JButton RetrybtnProfPrac;
    private JButton SoftDevRetryBtn;
    private JButton RetryCloudBtn;
    private JButton RetryCompScienceBtn;
    private JPanel LoginOrSignUp;
    private JTextPane LoginTxtPane;
    private JButton signUpBtnLoginOrSignUp;
    private JButton logInBtnLoginOrSignUp;
    private JButton BackBtnSignUpOrLogIn;
    private JTextPane LoginOrSignUpTxtPane;
    private JPanel SignUp;
    private JTextField signUpStudentReferenceTxtField;
    private JLabel usernameLbl;
    private JTextField signUpPasswordTxtField;
    private JButton signUpConfirmUsernameAndPassword;
    private JButton backBtnSignUp;
    private JButton nextBtnSignUp;
    private JPanel Login;
    private JTextField LoginStudentRefNumberTxtField;
    private JButton confirmBtnLogin;
    private JButton backBtnLogin;
    private JButton NextBtnLogin;
    private JPasswordField passwordJPasswordFieldLogin;
    private JCheckBox showPasswordLogin;
    private JPanel Profile;
    private JButton profileEditBtn;
    private JButton BackBtnProfile;
    private JButton networkRetryBtn;
    private JTextPane profileTxtPane;
    private JComboBox cloudCompPrac;
    private JTextArea profileWelcomeTxtArea;
    private JTextArea profileSubjectsTxtArea;
    private JTextArea profileGradesTxtArea;
    private JTextArea profileNameTxtArea;
    private JTextArea profileTotalTxtArea;
    private JTextArea profileOnTargetTxtArea;
    private JTextArea profilePassPercentageTxtArea;
    private JButton profileQuizBtn;
    private JButton profileSignOut;
    private JButton quizBtnResults;
    private JButton signOutBtnResults;
    private JPanel quizSelection;
    private JComboBox quizSelector;
    private JButton startBtnQuizSelection;
    private JButton IotRetryBtn;
    private JButton DigSkillsDataSciRetryBtn;
    private JButton DigSkillsCompSciRetryBtn;
    private JButton DigSkillsCyberSecRetryBtn;
    private JButton DigSkillsSoftDevRetryBtn;
    private JPanel LecturersView;
    private JTextArea userDataTxtAreaDataLecturers;
    private JButton loadUserLecturers;
    private JComboBox studentRefComboBoxLecturers;
    private JTextArea onTargetTxtAreaLecturers;
    private JTextArea passPercentageTxtAreaLecturers;
    private JTextArea nameTxtAreaLecturers;
    private JTextArea totalTxtAreaLecturers;
    private JButton signOutBtnLecturers;
    private JButton backBtnLecturersView;
    private JButton profileBtnQuizSelec;
    private JButton resultsBtnQuizSelec;
    private JButton viewTermsAndConditionsBtnSignUp;
    private JCheckBox agreeTermsAndConditionsCheckBoxSignUp;
    private JButton exitBtnResults;
    private JButton exitBtnQuizSelec;
    private JButton exitBtnLecturers;
    private JButton exitBtnWelcome;
    public String surname;
    public String forename;
    public int total;

    public String fullName;
    public String[] onTarget = {null, "Yes", "No"};
    public int index;

    double passPercentage;
    double roundOffPassPercentage;

    public int percentagePass;
    public int quizTotal;

    /*
    main method
    displays the frame with name of Study Buddy
    sets background for Study Buddy
    sets exit on close
    packs frames
    sets frame to visible
     */
    public static void main(String[] args) {
        // create new jFrame
        JFrame frame = new JFrame("Study Buddy");
        // set the jFrame to contain the GUI
        frame.setContentPane(new StudyBuddy().Background);
        // set exit on close, pack components and make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


    public StudyBuddy() {
        //Welcome page
        //action listener for continue button, takes user to Login or sign-up panel
        continueBtnWelcome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds login or sign-up panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(LoginOrSignUp);
                Background.repaint();
                Background.revalidate();

                //Disables next buttons
                NextBtnName.setEnabled(false);
                NextBtnDigSkillsSoftware.setEnabled(false);
                nextBtnDigSkillsCompSci.setEnabled(false);
                NextBtnCyber.setEnabled(false);
                NextBtnData.setEnabled(false);
                nextButtonIoT.setEnabled(false);
                networkNextButton.setEnabled(false);
                compSciNextButton.setEnabled(false);
                NextBtnCloud.setEnabled(false);
                NextBtnSoftDev.setEnabled(false);
                NextBtnProfPractice.setEnabled(false);
                NextBtnLogin.setEnabled(false);
            }
        });

        //Exit button on welcome page, closes the program when pressed
        exitBtnWelcome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Exits the program
                System.exit(0);
            }
        });

        //Login/Sign-up page
        //Back button on the login/sign-up page, moves back to Welcome page when pressed
        BackBtnSignUpOrLogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds Welcome panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Welcome);
                Background.repaint();
                Background.revalidate();
            }
        });

        //sign-up button on login/sign-up page, moves onto sign up page when pressed
        signUpBtnLoginOrSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds SignUp panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(SignUp);
                Background.repaint();
                Background.revalidate();

                //Disables the nextBtnSignUp
                nextBtnSignUp.setEnabled(false);

            }
        });

        //login button on login/sign-up page, moves onto login page when pressed
        logInBtnLoginOrSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds Login panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Login);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Sign up page
        //Confirms the new username and password when pressed
        signUpConfirmUsernameAndPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Checks to see if the sign-up text fields are empty and throws a warning message
                if (signUpStudentReferenceTxtField.getText().isEmpty() || signUpPasswordTxtField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a username and password.");
                }else {
                    /*Checks to see if the user agrees to the terms and conditions, if yes then the user can move on, if no then it will prompt a must
                    agree to terms and conditions to continue message.
                    */
                    if (agreeTermsAndConditionsCheckBoxSignUp.isSelected()) {
                        //Creates File called fileUsernames which represents users.txt//
                        File fileUsernames = new File("users.txt");


                        //Creates a new File called filed which represents signUpStudentReferenceTxtField.getText().txt
                        File file = new File(signUpStudentReferenceTxtField.getText() + ".txt");
                        if (file.exists()) {
                            JOptionPane.showMessageDialog(null, "Cannot create account as there is already an account with this student reference number or lecturers email.");
                        }
                        //If both text fields are filled in, this will write the student reference number and password to users.txt
                        else {
                            try {

                                //Creates a new FileOutputStream called fOut which represents fileUsernames.
                                FileOutputStream fOut = new FileOutputStream(fileUsernames, true);
                                OutputStreamWriter osw = new OutputStreamWriter(fOut);
                                osw.write(signUpStudentReferenceTxtField.getText() + "," + signUpPasswordTxtField.getText());
                                osw.write("\n");
                                osw.flush();
                                osw.close();

                            }
                            //Throws an exception if users.txt cannot be found
                            catch (Exception e2) {

                            }

                            //Enables nextBtnSignUp
                            nextBtnSignUp.setEnabled(true);

                            //Initialises writer
                            Writer writer = null;

                            //creates a new file using the student reference number when both the student reference number and password text fields are full
                            try {
                                writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(signUpStudentReferenceTxtField.getText() + ".txt"), "utf-8"));
                            } catch (IOException ex) {

                            } finally {
                                try {
                                    writer.close();
                                }
                                //If it can't create a file, it will prompt an error message.
                                catch (Exception ex) {
                                    JOptionPane.showMessageDialog(null, "Cannot create text file.");
                                }
                            }

                            //Writes student reference numbers to a text file
                            File fileUserRefNo = new File("usersRefNo.txt");
                            if (signUpStudentReferenceTxtField.getText().matches("\\d+")) {
                                try {
                                    //Creates a new FileOutputStream called fOut which represents fileUsernames.
                                    FileOutputStream fOut = new FileOutputStream(fileUserRefNo, true);
                                    OutputStreamWriter osw = new OutputStreamWriter(fOut);
                                    osw.write(signUpStudentReferenceTxtField.getText());
                                    osw.write(",");
                                    osw.flush();
                                    osw.close();

                                } catch (Exception e2) {
                                }
                            } else {

                            }

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You must agree to the Terms and Conditions to continue.");
                    }
                }
            }
        });

        //View terms and conditions button on sign up page, opens a JOptionPane to show the terms and conditions
        viewTermsAndConditionsBtnSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Terms and Conditions\n\n" +
                                                                          "1. Users must create an account to use the app.\n" +
                                                                          "2. The app will save user's inputted grades to a file which was \n    " +
                                                                          "created at sign-up and is named after the username (student reference number) \n    " +
                                                                          "so that the file can be identified.\n" +
                                                                          "3. Users must not share their account details with anyone else.\n" +
                                                                          "4. Users must not use the app for any illegal or unauthorized purpose.\n" +
                                                                          "5. The app is provided “as is” and without warranty of any kind, either express or implied.\n" +
                                                                          "6. The app may be updated from time to time and may contain bugs or errors.\n" +
                                                                          "7. The app may be terminated at any time without notice.");
            }
        });

        //Goes back to LoginOrSignUp page when pressed
        backBtnSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds Login or sign-up panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(LoginOrSignUp);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Moves onto the Name page when pressed
        nextBtnSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds Name panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Name);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Moves back to the LoginOrSignUp page
        backBtnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds Login or sign-up panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(LoginOrSignUp);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Login Page
        //Confirms login when pressed
        confirmBtnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Initialises username as input from loginStudentRefNumberTxtField and password as input from passwordJPasswordFieldLogin
                String username = LoginStudentRefNumberTxtField.getText();
                String password = String.valueOf(passwordJPasswordFieldLogin.getPassword());


                try {
                    //Creates a new File called file which represents users.txt
                    File file = new File("users.txt");
                    //Creates a new Scanner called scanner which represents file
                    Scanner scanner = new Scanner(file);

                    //A loop which reads the input from the scanner line by line until there is no lines left to read
                    while (scanner.hasNextLine()) {
                        //Initialises line as scanner.nextLine() and parts array as line.split whenever there is a comma with no space before or after.
                        String line = scanner.nextLine();
                        String[] parts = line.split(",");

                        //If this username and password exist on the file then it will prompt a Login successful message
                        if (username.equals(parts[0]) && password.equals(parts[1])) {

                            JOptionPane.showMessageDialog(null, "Login Successful");

                            //Enables next button
                            NextBtnLogin.setEnabled(true);

                            /*Checks whether username is an integer or a string, if it is an integer then it will look for the student
                            reference number text field and load it, if it is a string then it will just say login successful and enable next
                            button.
                            */
                            if (username.matches("\\d+")) {
                                try {
                                    //Creates FileReader called reader which represents LoginStudentRefNumberTxtField input text field
                                    FileReader reader = new FileReader(LoginStudentRefNumberTxtField.getText() + ".txt");
                                    //Creates new BufferedReader called br which represents reader
                                    BufferedReader br = new BufferedReader(reader);

                                    //Initialises lineRead as br.readLine() and partsRead array as lineRead.split which would be split by ", "
                                    String lineRead = br.readLine();
                                    String[] partsRead = lineRead.split(", ");


                                    //Reads the data from the account's text file and sets it to the fullName, grades, total, onTarget and percentagePass variables.
                                    fullName = partsRead[0];
                                    DigSkillsSoftwareDevTheory.setSelectedItem(partsRead[1]);
                                    DigSkillsSoftwareDevPrac.setSelectedItem(partsRead[2]);
                                    DigSkillsCyberGrade.setSelectedItem(partsRead[3]);
                                    DigSkillsCompSciGrade.setSelectedItem(partsRead[4]);
                                    DigSkillsDataGrade.setSelectedItem(partsRead[5]);
                                    iotTheoryGrade.setSelectedItem(partsRead[6]);
                                    iotPracticalGrade.setSelectedItem(partsRead[7]);
                                    networkTheory.setSelectedItem(partsRead[8]);
                                    networkPractical.setSelectedItem(partsRead[9]);
                                    compSciGrade.setSelectedItem(partsRead[10]);
                                    CloudCompTheoryGrade.setSelectedItem(partsRead[11]);
                                    cloudCompPrac.setSelectedItem(partsRead[12]);
                                    SoftDevTheoryGrade.setSelectedItem(partsRead[13]);
                                    SoftDevPracticalGrade.setSelectedItem(partsRead[14]);
                                    ProPractGrade.setSelectedItem(partsRead[15]);
                                    total = Integer.parseInt(partsRead[16]);
                                    index = Integer.parseInt(partsRead[17]);
                                    percentagePass = Integer.parseInt(partsRead[18]);


                                    //closes FileReader br
                                    br.close();

                                    //Displays a welcome back message.
                                    profileWelcomeTxtArea.setText("Welcome back " + fullName + "! You can check your grades and edit them if required. \nAfterwards you will be able to gain some practice through our revision quizzes. \nYour grades are shown below:");


                                    //Displays all the subjects on the profileSubjectsTxtArea
                                    profileSubjectsTxtArea.setText("\nDigital Skills: Software Development Theory");
                                    profileSubjectsTxtArea.append("\nDigital Skills: Software Development Practical");
                                    profileSubjectsTxtArea.append("\nDigital Skills: Cyber Security");
                                    profileSubjectsTxtArea.append("\nDigital Skills: Computer Science");
                                    profileSubjectsTxtArea.append("\nDigital Skills: Data Science");
                                    profileSubjectsTxtArea.append("\nInternet of Things Theory");
                                    profileSubjectsTxtArea.append("\nInternet of Things Practical");
                                    profileSubjectsTxtArea.append("\nNetwork Infrastructure Theory");
                                    profileSubjectsTxtArea.append("\nNetwork Infrastructure Practical");
                                    profileSubjectsTxtArea.append("\nComputer Science");
                                    profileSubjectsTxtArea.append("\nCloud Computing Theory");
                                    profileSubjectsTxtArea.append("\nCloud Computing Practical");
                                    profileSubjectsTxtArea.append("\nSoftware Development Theory");
                                    profileSubjectsTxtArea.append("\nSoftware Development Practical");
                                    profileSubjectsTxtArea.append("\nProfessional Practice");


                                    //Displays the grades in the profileGradesTxtArea
                                    profileGradesTxtArea.setText("\n   -   " + DigSkillsSoftwareDevTheory.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + DigSkillsSoftwareDevPrac.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + DigSkillsCyberGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + DigSkillsCompSciGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + DigSkillsDataGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + iotTheoryGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + iotPracticalGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + networkTheory.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + networkPractical.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + compSciGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + CloudCompTheoryGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + cloudCompPrac.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + SoftDevTheoryGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + SoftDevPracticalGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + ProPractGrade.getSelectedItem());


                                /*Displays fullName in the profileNameTxtArea, total in the profileTotalTxtArea,
                                onTarget in the profileOnTargetTxtArea and percentagePass in the profilePassPercentageTxtArea.
                                */
                                    profileNameTxtArea.setText("Name\n" + fullName);
                                    profileTotalTxtArea.setText("Total\n" + total);
                                    profileOnTargetTxtArea.setText("On Target\n" + onTarget[index]);
                                    profilePassPercentageTxtArea.setText("Pass Percentage\n" + percentagePass + "%");


                                }
                                //If there is an error reading from the file and setting the data to the fullName, grades, total, onTarget and percentagePass variables
                                catch (Exception e2) {
                                    System.out.println(e2);


                                }
                            }else{

                            }
                            return;
                        }
                        //If the login is invalid then it disables the nextBtnLogin
                        else {
                            NextBtnLogin.setEnabled(false);
                        }
                    }
                    //If the login doesn't exist in the users.txt then the login is invalid and an invalid username or password message is prompted.
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
                //If file isn't found then a File not found message will be prompted
                catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "File not found.");
                }
            }


        });

        //Shows and hides the password when pressed
        showPasswordLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //If checkbox is ticked, it shows the password, if it is not ticked then it will hide the password.
                if (showPasswordLogin.isSelected()) {
                    passwordJPasswordFieldLogin.setEchoChar((char) 0);
                } else {
                    passwordJPasswordFieldLogin.setEchoChar('*');
                }
            }
        });
        //Moves onto either lecturers view or profile panel when pressed
        NextBtnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Checks to see if it is an integer, if it is then it will move onto the Profile page, if not then it will move onto Lecturers View page
                if (LoginStudentRefNumberTxtField.getText().matches("\\d+")) {
                    //removes previous panel, adds Profile panel, repaints and revalidates panels
                    Background.removeAll();
                    Background.add(Profile);
                    Background.repaint();
                    Background.revalidate();
                } else {
                    //removes previous panel, adds Lecturers view panel, repaints and revalidates panels
                    Background.removeAll();
                    Background.add(LecturersView);
                    Background.repaint();
                    Background.revalidate();

                    //Reads data from a text file and adds the data to a JComboBox
                    try {
                        //Creates FileReader called reader which represents studentRefNo.txt
                        FileReader reader = new FileReader("usersRefNo.txt");
                        //Creates new BufferedReader called br which represents reader
                        BufferedReader br = new BufferedReader(reader);

                        //Initialises lineRead as br.readLine() and partsRead array as lineRead.split which would be split by ", "
                        String lineRead = br.readLine();
                        String[] partsRead = lineRead.split(",");

                        //Adds a blank item to the JComboBox
                        studentRefComboBoxLecturers.addItem(" ");
                        //loops until every item from the text file has been added to the JComboBox and stops after the last item was added.
                        for (int i = 0; i < partsRead.length; i++) {
                            studentRefComboBoxLecturers.addItem(partsRead[i]);
                        }

                        //closes FileReader br
                        br.close();
                    }
                    //If there is an error reading from the file and setting the data to the fullName, grades, total, onTarget and percentagePass variables
                    catch (Exception e2) {
                        System.out.println(e2);

                    }
                }
            }
        });


        //Profile page
        //Sets all the grade JComboBox to enabled, sets total to 0, disables all next buttons and enables all confirm buttons when pressed.
        profileEditBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds digital skills software development panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(DigitalSkillsSoftwareDev);
                Background.repaint();
                Background.revalidate();

                //Resetting the total back to 0
                total = 0;

                //Resetting subject retry buttons
                networkRetryBtn.setEnabled(false);
                RetrybtnProfPrac.setEnabled(false);
                RetryCloudBtn.setEnabled(false);
                RetryCompScienceBtn.setEnabled(false);
                SoftDevRetryBtn.setEnabled(false);
                IotRetryBtn.setEnabled(false);
                DigSkillsDataSciRetryBtn.setEnabled(false);
                DigSkillsCompSciRetryBtn.setEnabled(false);
                DigSkillsCyberSecRetryBtn.setEnabled(false);
                DigSkillsSoftDevRetryBtn.setEnabled(false);

                //Resetting subject confirm button
                confirmBtnNetworkInfrastructure.setEnabled(true);
                confirmBtnCloudComputing.setEnabled(true);
                confirmBtnSoftwareDevelopment.setEnabled(true);
                confirmBtnProfessionalPractice.setEnabled(true);
                confirmBtnComputerScience.setEnabled(true);
                confirmBtnDigSkillsSoftware.setEnabled(true);
                confirmBtnDSCS.setEnabled(true);
                confirmBtnDigSkillsCompSci.setEnabled(true);
                confirmBtnDataScience.setEnabled(true);
                confirmBtnIoT.setEnabled(true);

                //Setting the grades to editable
                DigSkillsSoftwareDevTheory.setEnabled(true);
                DigSkillsSoftwareDevPrac.setEnabled(true);
                DigSkillsCyberGrade.setEnabled(true);
                DigSkillsCompSciGrade.setEnabled(true);
                DigSkillsDataGrade.setEnabled(true);
                iotTheoryGrade.setEnabled(true);
                iotPracticalGrade.setEnabled(true);
                networkTheory.setEnabled(true);
                networkPractical.setEnabled(true);
                compSciGrade.setEnabled(true);
                CloudCompTheoryGrade.setEnabled(true);
                cloudCompPrac.setEnabled(true);
                SoftDevTheoryGrade.setEnabled(true);
                SoftDevPracticalGrade.setEnabled(true);
                ProPractGrade.setEnabled(true);


            }
        });
        //Moves back to Login page when pressed
        BackBtnProfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds Login panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Login);
                Background.repaint();
                Background.revalidate();
            }
        });
        //Signs user out, resets all text areas, JComboBox grades and moves to the welcome button when pressed
        profileSignOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Clearing all text areas after sign out.
                signUpStudentReferenceTxtField.setText("");
                LoginStudentRefNumberTxtField.setText("");
                signUpPasswordTxtField.setText("");
                passwordJPasswordFieldLogin.setText("");
                forenameTxtField.setText("");
                surnameTxtField.setText("");
                fullNameLbl.setText("");
                profileWelcomeTxtArea.setText("");
                profileSubjectsTxtArea.setText("");
                profileGradesTxtArea.setText("");
                profileNameTxtArea.setText("");
                profileTotalTxtArea.setText("");
                profileOnTargetTxtArea.setText("");
                profilePassPercentageTxtArea.setText("");
                ResultsTxtAreaInfo.setText("");
                ResultsTxtAreaName.setText("");
                ResultsTxtAreaTotal.setText("");
                ResultsTxtAreaOnTarget.setText("");
                ResultsTxtAreaPassPercentage.setText("");
                SummaryTxtAreaSubjects.setText("");
                SummaryTxtAreaGrades.setText("");

                //Setting grades to default.
                DigSkillsSoftwareDevTheory.setSelectedItem("Select Grade.");
                DigSkillsSoftwareDevPrac.setSelectedItem("Select Grade.");
                DigSkillsCyberGrade.setSelectedItem("Select Grade.");
                DigSkillsCompSciGrade.setSelectedItem("Select Grade.");
                DigSkillsDataGrade.setSelectedItem("Select Grade.");
                iotTheoryGrade.setSelectedItem("Select Grade.");
                iotPracticalGrade.setSelectedItem("Select Grade.");
                networkTheory.setSelectedItem("Select Grade.");
                networkPractical.setSelectedItem("Select Grade.");
                compSciGrade.setSelectedItem("Select Grade.");
                CloudCompTheoryGrade.setSelectedItem("Select Grade.");
                cloudCompPrac.setSelectedItem("Select Grade.");
                SoftDevTheoryGrade.setSelectedItem("Select Grade.");
                SoftDevPracticalGrade.setSelectedItem("Select Grade.");
                ProPractGrade.setSelectedItem("Select Grade.");

                //Resetting subject retry buttons
                networkRetryBtn.setEnabled(false);
                RetrybtnProfPrac.setEnabled(false);
                RetryCloudBtn.setEnabled(false);
                RetryCompScienceBtn.setEnabled(false);
                SoftDevRetryBtn.setEnabled(false);

                //Resetting subject confirm button
                confirmBtnNetworkInfrastructure.setEnabled(true);
                confirmBtnCloudComputing.setEnabled(true);
                confirmBtnSoftwareDevelopment.setEnabled(true);
                confirmBtnProfessionalPractice.setEnabled(true);
                confirmBtnComputerScience.setEnabled(true);

                //Setting the grades to editable
                SoftDevTheoryGrade.setEnabled(true);
                SoftDevPracticalGrade.setEnabled(true);

                //removes previous panel, adds welcome panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Welcome);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Moves onto quiz selection panel when pressed
        profileQuizBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds quiz selection panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(quizSelection);
                Background.repaint();
                Background.revalidate();
            }
        });


        //Name page
        //Confirms and displays the users full name when pressed
        confirmBtnName.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                //Checks if there is an input in the name textField and displays a message saying you must enter a name.
                if (forenameTxtField.getText().isEmpty() && surnameTxtField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"You must enter a name before you continue.");
                }else {

                    //Asks the user to input forename
                    forename = forenameTxtField.getText();
                    //Asks the user to input surname
                    surname = surnameTxtField.getText();
                    fullName = (forename + " " + surname);

                    //Puts the full name together and displays it on the full name label
                    fullNameLbl.setText(fullName);
                    NextBtnName.setEnabled(true);

                    DigSkillsSoftwareDevTheory.setSelectedItem("Select Grade.");
                    DigSkillsSoftwareDevPrac.setSelectedItem("Select Grade.");
                    DigSkillsCyberGrade.setSelectedItem("Select Grade.");
                    DigSkillsCompSciGrade.setSelectedItem("Select Grade.");
                    DigSkillsDataGrade.setSelectedItem("Select Grade.");
                    iotTheoryGrade.setSelectedItem("Select Grade.");
                    iotPracticalGrade.setSelectedItem("Select Grade.");
                    networkTheory.setSelectedItem("Select Grade.");
                    networkPractical.setSelectedItem("Select Grade.");
                    compSciGrade.setSelectedItem("Select Grade.");
                    CloudCompTheoryGrade.setSelectedItem("Select Grade.");
                    cloudCompPrac.setSelectedItem("Select Grade.");
                    SoftDevTheoryGrade.setSelectedItem("Select Grade.");
                    SoftDevPracticalGrade.setSelectedItem("Select Grade.");
                    ProPractGrade.setSelectedItem("Select Grade.");

                    //If all selected items in the JComboBoxes for grades are "Select Grade." (default option), index, total and percentage pass is set to 0.
                    if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Select Grade." || DigSkillsSoftwareDevPrac.getSelectedItem() == "Select Grade." || DigSkillsCyberGrade.getSelectedItem() == "Select Grade." || DigSkillsCompSciGrade.getSelectedItem() == "Select Grade." || DigSkillsDataGrade.getSelectedItem() == "Select Grade." || iotTheoryGrade.getSelectedItem() == "Select Grade." || iotPracticalGrade.getSelectedItem() == "Select Grade." || networkTheory.getSelectedItem() == "Select Grade." || networkPractical.getSelectedItem() == "Select Grade." || compSciGrade.getSelectedItem() == "Select Grade." || CloudCompTheoryGrade.getSelectedItem() == "Select Grade." || cloudCompPrac.getSelectedItem() == "Select Grade." || SoftDevTheoryGrade.getSelectedItem() == "Select Grade." || SoftDevPracticalGrade.getSelectedItem() == "Select Grade." || ProPractGrade.getSelectedItem() == "Select Grade.") {
                        index = 0;
                        total = 0;
                        percentagePass = 0;
                    }

                /*Creates a new File called fileNames which represents signUpStudentsReferenceTxtField.getText() text file
                and writes the users name, grades, total, whether they are on target and pass percentage to the file
                */
                    File fileNames = new File(signUpStudentReferenceTxtField.getText() + ".txt");

                    try {
                        //Creates a new FileOutputStream called fOut which represents fileNames and is set to append true
                        FileOutputStream fOut = new FileOutputStream(fileNames, true);
                        //Creates a new OutputStreamWriter called osw which represents fOut
                        OutputStreamWriter osw = new OutputStreamWriter(fOut);

                        //Writes the users full name, selected grades, total, whether they are on target or not and there percentage pass
                        osw.write(fullName + ", " + DigSkillsSoftwareDevTheory.getSelectedItem() + ", " + DigSkillsSoftwareDevPrac.getSelectedItem() + ", " + DigSkillsCyberGrade.getSelectedItem() + ", " + DigSkillsCompSciGrade.getSelectedItem() + ", " + DigSkillsDataGrade.getSelectedItem() + ", " + iotTheoryGrade.getSelectedItem() + ", " + iotPracticalGrade.getSelectedItem() + ", " + networkTheory.getSelectedItem() + ", " + networkPractical.getSelectedItem() + ", " + compSciGrade.getSelectedItem() + ", " + CloudCompTheoryGrade.getSelectedItem() + ", " + cloudCompPrac.getSelectedItem() + ", " + SoftDevTheoryGrade.getSelectedItem() + ", " + SoftDevPracticalGrade.getSelectedItem() + ", " + ProPractGrade.getSelectedItem() + ", " + total + ", " + index + ", " + percentagePass + ", ");
                        //Sends the data from the buffer to the file
                        osw.flush();
                        //Closes the output stream called osw
                        osw.close();
                    } catch (Exception e2) {

                    }

                }
            }
        });


        //Back button to move back to sign-up panel when pressed
        backBtnName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds Sign-up panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(SignUp);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Next button to move onto Login panel when pressed
        NextBtnName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds Login panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Login);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Digital Skills: Software Development page
        //Back button to move back to Profile panel when pressed
        backBtnDigSkillsSoftware.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds Profile panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Profile);
                Background.repaint();
                Background.revalidate();

            }
        });

        //Confirms digital skills software dev grade when pressed
        confirmBtnDigSkillsSoftware.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Enables next and retry button
                DigSkillsSoftDevRetryBtn.setEnabled(true);
                NextBtnDigSkillsSoftware.setEnabled(true);

                //Disables both the theory and practical grade JComboBox.
                DigSkillsSoftwareDevTheory.setEnabled(false);
                confirmBtnDigSkillsSoftware.setEnabled(false);
                DigSkillsSoftwareDevPrac.setEnabled(false);

                //Initialise DigSkillsSoftwareDevScore as an integer with value 0
                int DigSkillsSoftwareDevScore = 0;

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Pass.") {
                    DigSkillsSoftwareDevScore += 3;
                } else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 1)") {
                    DigSkillsSoftwareDevScore += 2;
                } else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 2)") {
                    DigSkillsSoftwareDevScore += 1;
                } else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 3)") {
                    DigSkillsSoftwareDevScore += 0;
                }

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Pass.") {
                    DigSkillsSoftwareDevScore += 3;
                } else if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 1)") {
                    DigSkillsSoftwareDevScore += 2;
                } else if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 2)") {
                    DigSkillsSoftwareDevScore += 1;
                } else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 3)") {
                    DigSkillsSoftwareDevScore += 0;
                }

                //Updates total and displays Digital Skills: Software Development total
                total = total + DigSkillsSoftwareDevScore;
                DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(DigSkillsSoftwareDevScore));
            }

        });

        //Resets digital skills software dev grades when pressed
        DigSkillsSoftDevRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Enables confirm button and the JComboBox for theory and practical grades
                confirmBtnDigSkillsSoftware.setEnabled(true);
                DigSkillsSoftwareDevTheory.setEnabled(true);
                DigSkillsSoftwareDevPrac.setEnabled(true);

                //Disables next button and retry button
                NextBtnDigSkillsSoftware.setEnabled(false);
                DigSkillsSoftDevRetryBtn.setEnabled(false);

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be subtracted from the total
                 */
                if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(0));
                } else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(0));
                } else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(0));
                }
                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be subtracted from the total
                 */
                if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(0));
                } else if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(0));
                } else if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(0));
                }
            }
        });
        //Next button to move onto digital skills cyber security page when pressed
        NextBtnDigSkillsSoftware.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds digital skills cyber security panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(DigitalSkillsCyber);
                Background.repaint();
                Background.revalidate();

            }
        });


        //Digital Skills: Cyber security page
        //Back button to move back to digital skills software dev page when pressed
        BackBtnCyber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds digital skills software development panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(DigitalSkillsSoftwareDev);
                Background.repaint();
                Background.revalidate();
            }
        });


        //Confirms digital skills cyber security grade when pressed
        confirmBtnDSCS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //Enables retry and next button
                DigSkillsCyberSecRetryBtn.setEnabled(true);
                NextBtnCyber.setEnabled(true);

                //Disables confirm button and JComboBox for grades
                DigSkillsCyberGrade.setEnabled(false);
                confirmBtnDSCS.setEnabled(false);

                //Initialises DigSkillsCyberSecureTotal as 0
                int DigSkillsCyberSecureTotal = 0;

               /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (DigSkillsCyberGrade.getSelectedItem() == "Pass.") {
                    DigSkillsCyberSecureTotal += 3;
                } else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    DigSkillsCyberSecureTotal += 2;
                } else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    DigSkillsCyberSecureTotal += 1;
                } else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    DigSkillsCyberSecureTotal += 0;
                }

                //Updates total and displays Digital Skills: Cyber-security total
                total = total + DigSkillsCyberSecureTotal;
                dscsLbl.setText(String.valueOf(DigSkillsCyberSecureTotal));

            }
        });


        //Resets digital skills cyber security grade when pressed
        DigSkillsCyberSecRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                //Enables confirm button and the JComboBox for grades
                confirmBtnDSCS.setEnabled(true);
                DigSkillsCyberGrade.setEnabled(true);

                //Disables confirm and next button
                NextBtnCyber.setEnabled(false);
                DigSkillsCyberSecRetryBtn.setEnabled(false);

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be subtracted from the total
                 */
                if (DigSkillsCyberGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    dscsLbl.setText(String.valueOf(0));
                } else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    dscsLbl.setText(String.valueOf(0));
                } else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    dscsLbl.setText(String.valueOf(0));


                }
            }
        });
        //Next button to move onto data science when pressed
        NextBtnCyber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds digital skills computer science panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(DigitalSkillsComputerScience);
                Background.repaint();
                Background.revalidate();

            }
        });

        //Digital Skills: Computer Science page
        //Back button to move back to digital skills cyber security page when pressed
        backBtnDigSkillsCompSci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds digital skills cyber security panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(DigitalSkillsCyber);
                Background.repaint();
                Background.revalidate();


            }
        });

        //Confirms Digital skills computer science grade when pressed.
        confirmBtnDigSkillsCompSci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Disables JComboBox for grades and disables confirm button
                DigSkillsCompSciGrade.setEnabled(false);
                confirmBtnDigSkillsCompSci.setEnabled(false);

                //Enables retry and next button
                DigSkillsCompSciRetryBtn.setEnabled(true);
                nextBtnDigSkillsCompSci.setEnabled(true);

                //Initialises DigSkillsCompSciTotal as 0
                int DigSkillsCompSciTotal = 0;


                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (DigSkillsCompSciGrade.getSelectedItem() == "Pass.") {
                    DigSkillsCompSciTotal += 3;
                } else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    DigSkillsCompSciTotal += 2;
                } else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    DigSkillsCompSciTotal += 1;
                } else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    DigSkillsCompSciTotal += 0;
                }

                //Updates total and displays Digital Skills: Computing Science total
                total = total + DigSkillsCompSciTotal;
                DigSkillsCompSciLbl.setText(String.valueOf(DigSkillsCompSciTotal));
            }
        });
        //Resets digital skills computer science grade when pressed
        DigSkillsCompSciRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Enables confirm button and JComboBox for grades
                confirmBtnDigSkillsCompSci.setEnabled(true);
                DigSkillsCompSciGrade.setEnabled(true);

                //Disables next and retry button
                nextBtnDigSkillsCompSci.setEnabled(false);
                DigSkillsCompSciRetryBtn.setEnabled(false);


                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be subtracted from the total
                 */
                if (DigSkillsCompSciGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    DigSkillsCompSciLbl.setText(String.valueOf(0));
                } else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    DigSkillsCompSciLbl.setText(String.valueOf(0));
                } else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    DigSkillsCompSciLbl.setText(String.valueOf(0));

                }
            }
        });

        //Next button to move onto the digital skills data science page when pressed
        nextBtnDigSkillsCompSci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds digital skills data science panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(DigSkillsDataScience);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Digital Skills: Data Science
        //Back button to move back to digital skills computer science
        BackBtnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds digital skills computer science panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(DigitalSkillsComputerScience);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Confirms Digital skills data science grade when pressed.
        confirmBtnDataScience.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //Disables confirm button and JComboBox for grades
                DigSkillsDataGrade.setEnabled(false);
                confirmBtnDataScience.setEnabled(false);

                //Enables next and retry button
                NextBtnData.setEnabled(true);
                DigSkillsDataSciRetryBtn.setEnabled(true);

                //Initialises total2 as 0
                int total2 = 0;

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (DigSkillsDataGrade.getSelectedItem() == "Pass.") {
                    total2 = total2 + 3;
                } else if (DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total2 = total2 + 2;
                } else if (DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total2 = total2 + 1;
                }
                //Updates total and displays Digital Skills: Data Science total
                DataLbl.setText(String.valueOf(total2));
                total = total + total2;
            }
        });
        //Resets digital skills data science grade when pressed
        DigSkillsDataSciRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Enables confirm button and JComboBox for grades
                DigSkillsDataGrade.setEnabled(true);
                confirmBtnDataScience.setEnabled(true);

                //Disables retry and next button
                DigSkillsDataSciRetryBtn.setEnabled(false);
                NextBtnData.setEnabled(false);

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be subtracted from the total
                 */
                if (DigSkillsDataGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    DataLbl.setText(String.valueOf(0));
                } else if (DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    DataLbl.setText(String.valueOf(0));
                } else if (DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    DataLbl.setText(String.valueOf(0));


                }
            }
        });

        //Next button to move onto IoT page when pressed
        NextBtnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds IoT panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(IoT);
                Background.repaint();
                Background.revalidate();
            }
        });

        //IoT page
        //Back button to move back digital skills data science when pressed
        backButtonIoT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds digital skills data science panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(DigSkillsDataScience);
                Background.repaint();
                Background.revalidate();
            }
        });


        //Confirms IoT grades when pressed.
        confirmBtnIoT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //Enables retry and next button
                IotRetryBtn.setEnabled(true);
                nextButtonIoT.setEnabled(true);

                //Disables confirm button and JComboBox for theory and practical grades.
                confirmBtnIoT.setEnabled(false);
                iotPracticalGrade.setEnabled(false);
                iotTheoryGrade.setEnabled(false);

                //Initialises Total3 as 0
                int Total3 = 0;

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (iotTheoryGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;
                } else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;
                } else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;
                } else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }
                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (iotPracticalGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;
                } else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;
                } else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;
                } else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }

                //Updates the total and displays the IoT total
                total = total + Total3;
                IotLbl.setText(String.valueOf(Total3));
            }
        });

        //Resets IoT grades when pressed
        IotRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Disables the next and retry button
                nextButtonIoT.setEnabled(false);
                IotRetryBtn.setEnabled(false);

                //Enables the confirm button and the JComboBox for theory and practical grades
                iotTheoryGrade.setEnabled(true);
                iotPracticalGrade.setEnabled(true);
                confirmBtnIoT.setEnabled(true);

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (iotTheoryGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    IotLbl.setText(String.valueOf(0));
                } else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    IotLbl.setText(String.valueOf(0));
                } else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    IotLbl.setText(String.valueOf(0));
                }
                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (iotPracticalGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    IotLbl.setText(String.valueOf(0));
                } else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    IotLbl.setText(String.valueOf(0));
                } else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    IotLbl.setText(String.valueOf(0));
                }
            }
        });

        //Next button to move onto network infrastructure page when pressed
        nextButtonIoT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds network infrastructure panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(NetworkInfrastructure);
                Background.repaint();
                Background.revalidate();


            }
        });

        //Network Infrastructure page
        //Back button to move back to IoT page when pressed
        networkBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds IoT panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(IoT);
                Background.repaint();
                Background.revalidate();


            }
        });

        //Confirms Network Infrastructure grades when pressed.
        confirmBtnNetworkInfrastructure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Disables the confirm button and the JComboBox for theory and practical grades
                networkTheory.setEnabled(false);
                networkPractical.setEnabled(false);
                confirmBtnNetworkInfrastructure.setEnabled(false);

                //Enables next and retry button
                networkNextButton.setEnabled(true);
                networkRetryBtn.setEnabled(true);

                //Initialises Total3 as 0
                int Total3 = 0;

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (networkTheory.getSelectedItem() == "Pass.") {
                    Total3 += 3;
                } else if (networkTheory.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;
                } else if (networkTheory.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;
                } else if (networkTheory.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }
                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (networkPractical.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (networkPractical.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (networkPractical.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (networkPractical.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                //Updates the total and displays the Network Infrastructure total.
                total = total + Total3;
                NetworkLbl.setText(String.valueOf(Total3));

            }
        });

        //Resets the network infrastructure grades when pressed
        networkRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Enables confirm button and JComboBox for theory and practical grades
                confirmBtnNetworkInfrastructure.setEnabled(true);
                networkTheory.setEnabled(true);
                networkPractical.setEnabled(true);

                //Disables next and retry button
                networkRetryBtn.setEnabled(false);
                networkNextButton.setEnabled(false);

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be subtracted from the total
                 */
                if (networkTheory.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    NetworkLbl.setText(String.valueOf(0));
                } else if (networkTheory.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    NetworkLbl.setText(String.valueOf(0));
                } else if (networkTheory.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    NetworkLbl.setText(String.valueOf(0));

                }
                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be subtracted from the total
                 */
                if (networkPractical.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    NetworkLbl.setText(String.valueOf(0));
                } else if (networkPractical.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    NetworkLbl.setText(String.valueOf(0));
                } else if (networkPractical.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    NetworkLbl.setText(String.valueOf(0));

                }

            }
        });

        //Next button to move onto computer science page when pressed
        networkNextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds computer science panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(ComputerScience);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Computer Science page
        //Back button to move back to network infrastructure page when pressed
        compSciBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds network infrastructure panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(NetworkInfrastructure);
                Background.repaint();
                Background.revalidate();


            }
        });

        //Confirms computer science grade when pressed.
        confirmBtnComputerScience.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Disables the confirm button and JComboBox for grades
                compSciGrade.setEnabled(false);
                confirmBtnComputerScience.setEnabled(false);

                //Enables retry and next button
                RetryCompScienceBtn.setEnabled(true);
                compSciNextButton.setEnabled(true);

                //Initialises Total3 as 0
                int Total3 = 0;


                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (compSciGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;
                } else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;
                } else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;
                } else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }

                //Updates the total and displays the Computer Science total
                total = total + Total3;
                compSciLbl.setText(String.valueOf(Total3));
            }
        });

        //Resets the computer science grades when pressed
        RetryCompScienceBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Enables confirm button and JComboBox for grades
                confirmBtnComputerScience.setEnabled(true);
                compSciGrade.setEnabled(true);

                //Disables retry and next button
                RetryCompScienceBtn.setEnabled(false);
                compSciNextButton.setEnabled(false);

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be subtracted from the total
                 */
                if (compSciGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    compSciLbl.setText(String.valueOf(0));
                } else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    compSciLbl.setText(String.valueOf(0));
                } else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    compSciLbl.setText(String.valueOf(0));

                }


            }
        });

        //Next button to move onto cloud computing page when pressed
        compSciNextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds cloud computing panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(CloudComputing);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Cloud Computing page
        //Back button to move back to computer science page when pressed
        BackBtnCloud.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds computer science panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(ComputerScience);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Confirms cloud computing grades when pressed.
        confirmBtnCloudComputing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Disables confirm button and JComboBox for theory and practical grades
                CloudCompTheoryGrade.setEnabled(false);
                cloudCompPrac.setEnabled(false);
                confirmBtnCloudComputing.setEnabled(false);

                //Enables next and retry button
                NextBtnCloud.setEnabled(true);
                RetryCloudBtn.setEnabled(true);

                //Initialises Total3 as 0
                int Total3 = 0;

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (CloudCompTheoryGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;
                } else if (CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;
                } else if (CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;
                } else if (CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }
                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (cloudCompPrac.getSelectedItem() == "Pass.") {
                    Total3 += 3;
                } else if (cloudCompPrac.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;
                } else if (cloudCompPrac.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;
                } else if (cloudCompPrac.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }

                //Updates the total and displays cloud computing total
                total = total + Total3;
                cloudCompLbl.setText(String.valueOf(Total3));

            }
        });
        //Resets the cloud computing grades when pressed
        RetryCloudBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Enables confirm button and JComboBox for theory and practical grades
                CloudCompTheoryGrade.setEnabled(true);
                cloudCompPrac.setEnabled(true);
                confirmBtnCloudComputing.setEnabled(true);

                //Disables next and retry button
                RetryCloudBtn.setEnabled(false);
                NextBtnCloud.setEnabled(false);

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be subtracted from the total
                 */
                if (CloudCompTheoryGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    cloudCompLbl.setText(String.valueOf(0));
                } else if (CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    cloudCompLbl.setText(String.valueOf(0));
                } else if (CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    cloudCompLbl.setText(String.valueOf(0));
                }
                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be subtracted from the total
                 */
                if (cloudCompPrac.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    cloudCompLbl.setText(String.valueOf(0));
                } else if (cloudCompPrac.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    cloudCompLbl.setText(String.valueOf(0));
                } else if (cloudCompPrac.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    cloudCompLbl.setText(String.valueOf(0));

                }
            }
        });
        //Next button to move onto Software Development page when pressed
        NextBtnCloud.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds software development panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(SoftwareDevelopment);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Software Development page
        //Back button to move back to cloud computing when pressed
        BackBtnSoftDev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds cloud computing panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(CloudComputing);
                Background.repaint();
                Background.revalidate();

            }
        });

        //Confirms software development grades when pressed.
        confirmBtnSoftwareDevelopment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Disables confirm button and JComboBox for theory and practical grades
                SoftDevTheoryGrade.setEnabled(false);
                SoftDevPracticalGrade.setEnabled(false);
                confirmBtnSoftwareDevelopment.setEnabled(false);

                //Enables retry and next button
                SoftDevRetryBtn.setEnabled(true);
                NextBtnSoftDev.setEnabled(true);

                //Initiales Total3 as 0
                int Total3 = 0;

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (SoftDevTheoryGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;
                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;
                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;
                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }
                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (SoftDevPracticalGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;
                } else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;
                } else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;
                } else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }

                //Updates total and displays software development total
                total = total + Total3;
                softDevLbl.setText(String.valueOf(Total3));



            }
        });

        //Resets software development grade when pressed
        SoftDevRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Enable confirm button and JComboBox for theory and practical grades
                SoftDevTheoryGrade.setEnabled(true);
                SoftDevPracticalGrade.setEnabled(true);
                confirmBtnSoftwareDevelopment.setEnabled(true);

                //Disables retry and next button
                SoftDevRetryBtn.setEnabled(false);
                NextBtnSoftDev.setEnabled(false);

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be subtracted from the total
                 */
                if (SoftDevPracticalGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    softDevLbl.setText(String.valueOf(0));
                } else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    softDevLbl.setText(String.valueOf(0));
                } else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    softDevLbl.setText(String.valueOf(0));
                }
                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be subtracted from the total
                 */
                if (SoftDevTheoryGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    softDevLbl.setText(String.valueOf(0));
                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    softDevLbl.setText(String.valueOf(0));
                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    softDevLbl.setText(String.valueOf(0));
                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    total = total - 0;
                    softDevLbl.setText(String.valueOf(0));
                }

            }
        });
        //Next button to move onto professional practice page when pressed
        NextBtnSoftDev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds professional practice panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(ProfessionalPractice);
                Background.repaint();
                Background.revalidate();

            }
        });

        //Professional Practice page
        //Back button to move back to software development page when pressed
        BackBtnProfPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds software development panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(SoftwareDevelopment);
                Background.repaint();
                Background.revalidate();

            }
        });

        //Confirms professional practice grade when pressed.
        confirmBtnProfessionalPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Enables next and retry button
                NextBtnProfPractice.setEnabled(true);
                RetrybtnProfPrac.setEnabled(true);

                //Disables confirm button and JComboBox for grades
                ProPractGrade.setEnabled(false);
                confirmBtnProfessionalPractice.setEnabled(false);

                //Initialises Total3 as 0
                int Total3 = 0;

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be added to the total
                 */
                if (ProPractGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;
                } else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;
                } else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;
                } else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }

                //Updates total and displays professional practice total
                total = total + Total3;
                ProfPracticeLbl.setText(String.valueOf(Total3));

            }
        });
        //Resets professional practice grade when pressed
        RetrybtnProfPrac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Enable confirm button and JComboBox for grades
                confirmBtnProfessionalPractice.setEnabled(true);
                ProPractGrade.setEnabled(true);

                //Disables next and retry button
                NextBtnProfPractice.setEnabled(false);
                RetrybtnProfPrac.setEnabled(false);

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 or 3
                should be subtracted from the total
                 */
                if (ProPractGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    ProfPracticeLbl.setText(String.valueOf(0));
                } else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    ProfPracticeLbl.setText(String.valueOf(0));
                } else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    ProfPracticeLbl.setText(String.valueOf(0));
                }


            }
        });

        //Next button to move onto Summary page when pressed
        NextBtnProfPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds Summary panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Summary);
                Background.repaint();
                Background.revalidate();


                //Initialise subject inputs which = the selected item for the grade JComboBox
                String digSkillsSoftwareDevTheoryInput = (String) DigSkillsSoftwareDevTheory.getSelectedItem();
                String digSkillsSoftwareDevPracInput = (String) DigSkillsSoftwareDevPrac.getSelectedItem();
                String digSkillsCyberInput = (String) DigSkillsCyberGrade.getSelectedItem();
                String digSkillsCompSciInput = (String) DigSkillsCompSciGrade.getSelectedItem();
                String digSkillsDataSciInput = (String) DigSkillsDataGrade.getSelectedItem();
                String IoTTheoryInput = (String) iotTheoryGrade.getSelectedItem();
                String IoTPracticalInput = (String) iotPracticalGrade.getSelectedItem();
                String networkTheoryInput = (String) networkTheory.getSelectedItem();
                String networkPracticalInput = (String) networkPractical.getSelectedItem();
                String compSciInput = (String) compSciGrade.getSelectedItem();
                String cloudCompTheoryInput = (String) CloudCompTheoryGrade.getSelectedItem();
                String cloudCompPracInput = (String) cloudCompPrac.getSelectedItem();
                String softwareDevTheoryInput = (String) SoftDevTheoryGrade.getSelectedItem();
                String softwareDevPracInput = (String) SoftDevPracticalGrade.getSelectedItem();
                String professionalPracticeInput = (String) ProPractGrade.getSelectedItem();

                //Displays name and subjects on SummaryTxtAreaSubjects
                SummaryTxtAreaSubjects.setText(fullName + "\n" + "Your grades are:\n");
                SummaryTxtAreaSubjects.append("\nDigital Skills: Software Development Theory");
                SummaryTxtAreaSubjects.append("\nDigital Skills: Software Development Practical");
                SummaryTxtAreaSubjects.append("\nDigital Skills: Cyber Security");
                SummaryTxtAreaSubjects.append("\nDigital Skills: Computer Science");
                SummaryTxtAreaSubjects.append("\nDigital Skills: Data Science");
                SummaryTxtAreaSubjects.append("\nInternet of Things Theory");
                SummaryTxtAreaSubjects.append("\nInternet of Things Practical");
                SummaryTxtAreaSubjects.append("\nNetwork Infrastructure Theory");
                SummaryTxtAreaSubjects.append("\nNetwork Infrastructure Practical");
                SummaryTxtAreaSubjects.append("\nComputer Science");
                SummaryTxtAreaSubjects.append("\nCloud Computing Theory");
                SummaryTxtAreaSubjects.append("\nCloud Computing Practical");
                SummaryTxtAreaSubjects.append("\nSoftware Development Theory");
                SummaryTxtAreaSubjects.append("\nSoftware Development Practical");
                SummaryTxtAreaSubjects.append("\nProfessional Practice");

                //Displays grades on SummaryTxtAreaGrades
                SummaryTxtAreaGrades.setText("\n\n");
                SummaryTxtAreaGrades.append("\n   -   " + digSkillsSoftwareDevTheoryInput);
                SummaryTxtAreaGrades.append("\n   -   " + digSkillsSoftwareDevPracInput);
                SummaryTxtAreaGrades.append("\n   -   " + digSkillsCyberInput);
                SummaryTxtAreaGrades.append("\n   -   " + digSkillsCompSciInput);
                SummaryTxtAreaGrades.append("\n   -   " + digSkillsDataSciInput);
                SummaryTxtAreaGrades.append("\n   -   " + IoTTheoryInput);
                SummaryTxtAreaGrades.append("\n   -   " + IoTPracticalInput);
                SummaryTxtAreaGrades.append("\n   -   " + networkTheoryInput);
                SummaryTxtAreaGrades.append("\n   -   " + networkPracticalInput);
                SummaryTxtAreaGrades.append("\n   -   " + compSciInput);
                SummaryTxtAreaGrades.append("\n   -   " + cloudCompTheoryInput);
                SummaryTxtAreaGrades.append("\n   -   " + cloudCompPracInput);
                SummaryTxtAreaGrades.append("\n   -   " + softwareDevTheoryInput);
                SummaryTxtAreaGrades.append("\n   -   " + softwareDevPracInput);
                SummaryTxtAreaGrades.append("\n   -   " + professionalPracticeInput);

                //Displays information on how the grading works in the SummaryTxtAreaInfo
                SummaryTxtAreaInfo.setText("We have assigned each grade with a value to help calculate if you are on track to \npass. After selecting and confirming a grade, we add the number assigned to that \ngrade to the total and if this total is above our threshold of 33 then you are on track to \npass, if below our threshold of 33 then you may still be able to pass, however you are \ncurrently on course for a pass.");
            }
        });

        //Summary page
        //Back button to move back to professional practice page when pressed
        backBtnSummary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds professional practice panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(ProfessionalPractice);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Next button to move onto Results page when pressed
        nextBtnSummary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds results panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Results);
                Background.repaint();
                Background.revalidate();

                //Calculates the pass percentage, rounds it and converts it to an int
                passPercentage = (total * 100) / 45;
                roundOffPassPercentage = Math.round(passPercentage * 100.0) / 100.0;
                percentagePass = (int) roundOffPassPercentage;

                //If every grade JComboBox is a fail then index = 2, if not and total is greater than 22 then index = 1
                if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 3)" || DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 3)" || DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 3)" || DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 3)" || DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 3)" || iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 3)" || iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)" || networkTheory.getSelectedItem() == "Fail. (Attempt 3)" || networkPractical.getSelectedItem() == "Fail. (Attempt 3)" || compSciGrade.getSelectedItem() == "Fail. (Attempt 3)" || CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)" || SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 3)" || SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)" || ProPractGrade.getSelectedItem() == "Fail. (Attempt 3)" || total < 31) {
                    index = 2;
                } else if (total >= 32) {
                    index = 1;
                } else {
                    index = 0;
                }


                //Displays information about how the results are calculated.
                ResultsTxtAreaInfo.setText("The total is calculated by adding on a set value dependant on the grade and \nattempt, to be on target, you must have a total of 33 or higher and must have \ngreater than a fail attempt 3.");

                //Displays fullName
                ResultsTxtAreaName.setText("Name\n" + fullName);

                //Displays total
                ResultsTxtAreaTotal.setText("Total\n" + total);

                //Uses index to decide which item in the onTarget array will be selected to display whether they are on target or not.
                ResultsTxtAreaOnTarget.setText("On Target\n" + onTarget[index]);

                //Displays the percentage pass.
                ResultsTxtAreaPassPercentage.setText("Pass Percentage\n" + percentagePass + "%");
            }
        });

        //Results page
        //Back button to move back to the summary page when pressed
        backBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds summary panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Summary);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Saves the results to a file when pressed
        saveBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*Initialises File called studentRefNo which represents the users inputted LoginStudentRefNumberTxtField
                text file
                */
                File studenRefNo = new File(LoginStudentRefNumberTxtField.getText() + ".txt");

                /*Writes the users name, grades and results into their inputted student reference number text field,
                replacing previous data
                */
                try {
                    FileOutputStream fOut = new FileOutputStream(studenRefNo, false);
                    OutputStreamWriter osw = new OutputStreamWriter(fOut);
                    osw.write(fullName + ", " + DigSkillsSoftwareDevTheory.getSelectedItem() + ", " + DigSkillsSoftwareDevPrac.getSelectedItem() + ", " + DigSkillsCyberGrade.getSelectedItem() + ", " + DigSkillsCompSciGrade.getSelectedItem() + ", " + DigSkillsDataGrade.getSelectedItem() + ", " + iotTheoryGrade.getSelectedItem() + ", " + iotPracticalGrade.getSelectedItem() + ", " + networkTheory.getSelectedItem() + ", " + networkPractical.getSelectedItem() + ", " + compSciGrade.getSelectedItem() + ", " + CloudCompTheoryGrade.getSelectedItem() + ", " + cloudCompPrac.getSelectedItem() + ", " + SoftDevTheoryGrade.getSelectedItem() + ", " + SoftDevPracticalGrade.getSelectedItem() + ", " + ProPractGrade.getSelectedItem() + ", " + total + ", " + index + ", " + percentagePass + ", ");
                    osw.flush();
                    osw.close();
                }
                //Catches any exceptions, for example, it would catch if there was no file to save the data to.
                catch (Exception e2) {
                }
            }
        });

        //Edit grades button, moves back to digital skills software development when pressed
        editGradesBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds digital skills software development panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(DigitalSkillsSoftwareDev);
                Background.repaint();
                Background.revalidate();

                //Resets the total back to 0
                total = 0;

                //Resetting subject retry buttons
                networkRetryBtn.setEnabled(false);
                RetrybtnProfPrac.setEnabled(false);
                RetryCloudBtn.setEnabled(false);
                RetryCompScienceBtn.setEnabled(false);
                SoftDevRetryBtn.setEnabled(false);
                IotRetryBtn.setEnabled(false);
                DigSkillsDataSciRetryBtn.setEnabled(false);
                DigSkillsCompSciRetryBtn.setEnabled(false);
                DigSkillsCyberSecRetryBtn.setEnabled(false);
                DigSkillsSoftDevRetryBtn.setEnabled(false);

                //Resetting subject confirm button
                confirmBtnNetworkInfrastructure.setEnabled(true);
                confirmBtnCloudComputing.setEnabled(true);
                confirmBtnSoftwareDevelopment.setEnabled(true);
                confirmBtnProfessionalPractice.setEnabled(true);
                confirmBtnComputerScience.setEnabled(true);
                confirmBtnDigSkillsSoftware.setEnabled(true);
                confirmBtnDSCS.setEnabled(true);
                confirmBtnDigSkillsCompSci.setEnabled(true);
                confirmBtnDataScience.setEnabled(true);
                confirmBtnIoT.setEnabled(true);

                //Setting the grades to editable
                DigSkillsSoftwareDevTheory.setEnabled(true);
                DigSkillsSoftwareDevPrac.setEnabled(true);
                DigSkillsCyberGrade.setEnabled(true);
                DigSkillsCompSciGrade.setEnabled(true);
                DigSkillsDataGrade.setEnabled(true);
                iotTheoryGrade.setEnabled(true);
                iotPracticalGrade.setEnabled(true);
                networkTheory.setEnabled(true);
                networkPractical.setEnabled(true);
                compSciGrade.setEnabled(true);
                CloudCompTheoryGrade.setEnabled(true);
                cloudCompPrac.setEnabled(true);
                SoftDevTheoryGrade.setEnabled(true);
                SoftDevPracticalGrade.setEnabled(true);
                ProPractGrade.setEnabled(true);
            }
        });

        //Sign out button on results page, signs the user out and moves back to the welcome page when pressed
        signOutBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Clearing all text areas after sign out.
                signUpStudentReferenceTxtField.setText("");
                LoginStudentRefNumberTxtField.setText("");
                signUpPasswordTxtField.setText("");
                passwordJPasswordFieldLogin.setText("");
                forenameTxtField.setText("");
                surnameTxtField.setText("");
                fullNameLbl.setText("");
                profileWelcomeTxtArea.setText("");
                profileSubjectsTxtArea.setText("");
                profileGradesTxtArea.setText("");
                profileNameTxtArea.setText("");
                profileTotalTxtArea.setText("");
                profileOnTargetTxtArea.setText("");
                profilePassPercentageTxtArea.setText("");
                ResultsTxtAreaInfo.setText("");
                ResultsTxtAreaName.setText("");
                ResultsTxtAreaTotal.setText("");
                ResultsTxtAreaOnTarget.setText("");
                ResultsTxtAreaPassPercentage.setText("");
                SummaryTxtAreaSubjects.setText("");
                SummaryTxtAreaGrades.setText("");

                //Setting grades to default.
                DigSkillsSoftwareDevTheory.setSelectedItem("Select Grade.");
                DigSkillsSoftwareDevPrac.setSelectedItem("Select Grade.");
                DigSkillsCyberGrade.setSelectedItem("Select Grade.");
                DigSkillsCompSciGrade.setSelectedItem("Select Grade.");
                DigSkillsDataGrade.setSelectedItem("Select Grade.");
                iotTheoryGrade.setSelectedItem("Select Grade.");
                iotPracticalGrade.setSelectedItem("Select Grade.");
                networkTheory.setSelectedItem("Select Grade.");
                networkPractical.setSelectedItem("Select Grade.");
                compSciGrade.setSelectedItem("Select Grade.");
                CloudCompTheoryGrade.setSelectedItem("Select Grade.");
                cloudCompPrac.setSelectedItem("Select Grade.");
                SoftDevTheoryGrade.setSelectedItem("Select Grade.");
                SoftDevPracticalGrade.setSelectedItem("Select Grade.");
                ProPractGrade.setSelectedItem("Select Grade.");

                //Resetting subject retry buttons
                networkRetryBtn.setEnabled(false);
                RetrybtnProfPrac.setEnabled(false);
                RetryCloudBtn.setEnabled(false);
                RetryCompScienceBtn.setEnabled(false);
                SoftDevRetryBtn.setEnabled(false);

                //Resetting subject confirm button
                confirmBtnNetworkInfrastructure.setEnabled(true);
                confirmBtnCloudComputing.setEnabled(true);
                confirmBtnSoftwareDevelopment.setEnabled(true);
                confirmBtnProfessionalPractice.setEnabled(true);
                confirmBtnComputerScience.setEnabled(true);

                //Setting the grades to editable
                SoftDevTheoryGrade.setEnabled(true);
                SoftDevPracticalGrade.setEnabled(true);

                Background.removeAll();
                Background.add(Welcome);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Quiz button on results page, moves onto quiz selection page when pressed.
        quizBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds quiz selection panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(quizSelection);
                Background.repaint();
                Background.revalidate();

            }
        });

        //Exit button on results program, exits the app when pressed
        exitBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Exits the program
                System.exit(0);
            }
        });

        //Quiz Selection page quiz
        //Start button on quiz selection page, starts the selected quiz when pressed
        startBtnQuizSelection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Getting the user's input from the quizSelector jComboBox to work out which quiz the user wants to attempt
                if (quizSelector.getSelectedItem() == "Digital Skills: Software Development.") {
                    //Creates a new instance of the DigSkillsSoftDevQuiz class and assigns it to the variable prog
                    DigSkillsSoftDevQuiz prog = new DigSkillsSoftDevQuiz();

                    //Calls the method called DigSkillsSoftDevQuizQ1 within the DigSkillsSoftDevQuiz class
                    prog.DigSkillsSoftDevQuizQ1();
                } else if (quizSelector.getSelectedItem() == "Digital Skills: Cyber Security.") {
                    //Creates a new instance of the DigSkillsCyberSecQuiz class and assigns it to the variable prog
                    DigSkillsCyberSecQuiz prog = new DigSkillsCyberSecQuiz();

                    //Calls the method called DigSkillsCyberSecQuizQ1 within the DigSkillsSoftDevQuiz class
                    prog.DigSkillsCyberSecQuizQ1();
                } else if (quizSelector.getSelectedItem() == "Digital Skills: Computer Science.") {
                    //Creates a new instance of the DigSkillsCompSciQuiz class and assigns it to the variable prog
                    DigSkillsCompSciQuiz prog = new DigSkillsCompSciQuiz();

                    //Calls the method called DigSkillsCompSciQ1 within the DigSkillsSoftDevQuiz class
                    prog.DigSkillsCompSciQ1();
                } else if (quizSelector.getSelectedItem() == "Digital Skills: Data Science.") {
                    //Creates a new instance of the DigSkillsDataSciQuiz class and assigns it to the variable prog
                    DigSkillsDataSciQuiz prog = new DigSkillsDataSciQuiz();

                    //Calls the method called DigSkillsDataSciQuizQ1 within the DigSkillsSoftDevQuiz class
                    prog.DigSkillsDataSciQuizQ1();
                } else if (quizSelector.getSelectedItem() == "Internet of Things.") {
                    //Creates a new instance of the IoTQuiz class and assigns it to the variable prog
                    IoTQuiz prog = new IoTQuiz();

                    //Calls the method called IoTQuizQ1 within the DigSkillsSoftDevQuiz class
                    prog.IoTQuizQ1();
                } else if (quizSelector.getSelectedItem() == "Network Infrastructure.") {
                    //Creates a new instance of the NetworkInfraQuiz class and assigns it to the variable prog
                    NetworkInfraQuiz prog = new NetworkInfraQuiz();

                    //Calls the method called NetworkInfraQ1 within the DigSkillsSoftDevQuiz class
                    prog.NetworkInfraQ1();
                } else if (quizSelector.getSelectedItem() == "Computer Science.") {
                    //Creates a new instance of the ComputerScienceQuiz class and assigns it to the variable prog
                    ComputerScienceQuiz prog = new ComputerScienceQuiz();

                    //Calls the method called ComputerScienceQuizQ1 within the DigSkillsSoftDevQuiz class
                    prog.ComputerScienceQuizQ1();
                } else if (quizSelector.getSelectedItem() == "Cloud Computing.") {
                    //Creates a new instance of the CloudComputingQuiz class and assigns it to the variable prog
                    CloudComputingQuiz prog = new CloudComputingQuiz();

                    //Calls the method called CloudComputingQuizQ1 within the DigSkillsSoftDevQuiz class
                    prog.CloudComputingQuizQ1();
                } else if (quizSelector.getSelectedItem() == "Software Development.") {
                    //Creates a new instance of the SoftwareDevelopmentQuiz class and assigns it to the variable prog
                    SoftwareDevelopmentQuiz prog = new SoftwareDevelopmentQuiz();

                    //Calls the method called SoftDevQuizQ1 within the DigSkillsSoftDevQuiz class
                    prog.SoftDevQuizQ1();
                } else if (quizSelector.getSelectedItem() == "Professional Practice.") {
                    //Creates a new instance of the ProfessionalPracticeQuiz class and assigns it to the variable prog
                    ProfessionalPracticeQuiz prog = new ProfessionalPracticeQuiz();

                    //Calls the method called ProfessionalPracticeQuizQ1 within the DigSkillsSoftDevQuiz class
                    prog.ProfessionalPracticeQuizQ1();
                } else {
                    //Prompts a "There was no quiz selected!" message
                    JOptionPane.showMessageDialog(null, "There was no quiz selected!");
                }


            }

        });

        //Profile button on quiz selection page, moves back to the profile page when pressed
        profileBtnQuizSelec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds profile panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Profile);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Results button on quiz selection page, moves back to the results page when pressed
        resultsBtnQuizSelec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds results panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Results);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Exit button on quiz selection page, closes the app when pressed
        exitBtnQuizSelec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Exits the program
                System.exit(0);
            }
        });

        //Lecturers view page
        /*Loads user profile and displays the selected students profile when pressed
        */
        loadUserLecturers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    //Creates FileReader called reader which represents LoginStudentRefNumberTxtField input text field
                    FileReader reader = new FileReader(studentRefComboBoxLecturers.getSelectedItem() + ".txt");
                    //Creates new BufferedReader called br which represents reader
                    BufferedReader br = new BufferedReader(reader);

                    //Initialises lineRead as br.readLine() and partsRead array as lineRead.split which would be split by ", "
                    String lineRead = br.readLine();
                    String[] partsRead = lineRead.split(", ");


                    //Closes the FileReader called br
                    br.close();
                    int index = Integer.parseInt(partsRead[17]);

                    //Displays all the subjects on the profileSubjectsTxtArea
                    userDataTxtAreaDataLecturers.setText(partsRead[0] + "file.\n" +
                            "\nDigital Skills: Software Development Theory\t-   " + partsRead[1] +
                            "\nDigital Skills: Software Development Practical\t-   " + partsRead[2] +
                            "\nDigital Skills: Cyber Security\t\t-   " + partsRead[3] +
                            "\nDigital Skills: Computer Science\t-   " + partsRead[4] +
                            "\nDigital Skills: Data Science\t\t-   " + partsRead[5] +
                            "\nInternet of Things Theory\t\t-   " + partsRead[6] +
                            "\nInternet of Things Practical\t\t-   " + partsRead[7] +
                            "\nNetwork Infrastructure Theory\t\t-   " + partsRead[8] +
                            "\nNetwork Infrastructure Practical\t\t-   " + partsRead[9] +
                            "\nComputer Science\t\t-   " + partsRead[10] +
                            "\nCloud Computing Theory\t\t-   " + partsRead[11] +
                            "\nCloud Computing Practical\t\t-   " + partsRead[12] +
                            "\nSoftware Development Theory\t\t-   " + partsRead[13] +
                            "\nSoftware Development Practical\t\t-   " + partsRead[14] +
                            "\nProfessional Practice\t\t-   " + partsRead[15]);

                    //Displays the selected users full name, total, if they are on target or not and their percentage pass.
                    nameTxtAreaLecturers.setText("Name\n" + partsRead[0]);
                    totalTxtAreaLecturers.setText("total\n" + partsRead[16]);
                    onTargetTxtAreaLecturers.setText("On Target\n" + onTarget[index]);
                    passPercentageTxtAreaLecturers.append("Pass Percentage\n" + partsRead[18]);


                }
                //If there is an error reading from the file and displaying the data, it will print a message about an exception
                catch (Exception e2) {
                    System.out.println(e2);
                }

            }


        });

        //Back button on lecturers view page to move back to the Login page when pressed
        backBtnLecturersView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds Login panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Login);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Sign-out button on lecturers view page, signs the user out when pressed
        signOutBtnLecturers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds welcome panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Welcome);
                Background.repaint();
                Background.revalidate();

                //Resets all the text fields to default (empties them)
                signUpStudentReferenceTxtField.setText("");
                LoginStudentRefNumberTxtField.setText("");
                signUpPasswordTxtField.setText("");
                passwordJPasswordFieldLogin.setText("");
                forenameTxtField.setText("");
                surnameTxtField.setText("");
                fullNameLbl.setText("");
                profileWelcomeTxtArea.setText("");
                profileSubjectsTxtArea.setText("");
                profileGradesTxtArea.setText("");
                profileNameTxtArea.setText("");
                profileTotalTxtArea.setText("");
                profileOnTargetTxtArea.setText("");
                profilePassPercentageTxtArea.setText("");
                ResultsTxtAreaInfo.setText("");
                ResultsTxtAreaName.setText("");
                ResultsTxtAreaTotal.setText("");
                ResultsTxtAreaOnTarget.setText("");
                ResultsTxtAreaPassPercentage.setText("");
                SummaryTxtAreaSubjects.setText("");
                SummaryTxtAreaGrades.setText("");

                //Setting grades to default.
                DigSkillsSoftwareDevTheory.setSelectedItem("Select Grade.");
                DigSkillsSoftwareDevPrac.setSelectedItem("Select Grade.");
                DigSkillsCyberGrade.setSelectedItem("Select Grade.");
                DigSkillsCompSciGrade.setSelectedItem("Select Grade.");
                DigSkillsDataGrade.setSelectedItem("Select Grade.");
                iotTheoryGrade.setSelectedItem("Select Grade.");
                iotPracticalGrade.setSelectedItem("Select Grade.");
                networkTheory.setSelectedItem("Select Grade.");
                networkPractical.setSelectedItem("Select Grade.");
                compSciGrade.setSelectedItem("Select Grade.");
                CloudCompTheoryGrade.setSelectedItem("Select Grade.");
                cloudCompPrac.setSelectedItem("Select Grade.");
                SoftDevTheoryGrade.setSelectedItem("Select Grade.");
                SoftDevPracticalGrade.setSelectedItem("Select Grade.");
                ProPractGrade.setSelectedItem("Select Grade.");

                //Resetting subject retry buttons
                networkRetryBtn.setEnabled(false);
                RetrybtnProfPrac.setEnabled(false);
                RetryCloudBtn.setEnabled(false);
                RetryCompScienceBtn.setEnabled(false);
                SoftDevRetryBtn.setEnabled(false);

                //Resetting subject confirm button
                confirmBtnNetworkInfrastructure.setEnabled(true);
                confirmBtnCloudComputing.setEnabled(true);
                confirmBtnSoftwareDevelopment.setEnabled(true);
                confirmBtnProfessionalPractice.setEnabled(true);
                confirmBtnComputerScience.setEnabled(true);

                //Setting the grades to editable
                SoftDevTheoryGrade.setEnabled(true);
                SoftDevPracticalGrade.setEnabled(true);
            }
        });

        //Exit button on lecturers page, closes the program when pressed
        exitBtnLecturers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Exits the program
                System.exit(0);
            }
        });


    }


}

