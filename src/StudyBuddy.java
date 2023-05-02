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
    private JButton continueBtn;
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
    private JTextPane LogInTxtPane;
    private JButton signUpBtn;
    private JButton logInBtn;
    private JButton BackBtnSignUpOrLogIn;
    private JTextPane LogInOrSignUpTxtPane;
    private JPanel SignUp;
    private JTextField signUpStudentReferenceTxtField;
    private JLabel usernameLbl;
    private JTextField signUpPasswordTxtField;
    private JButton signUpConfirmUsernameAndPassword;
    private JButton backBtnSignUp;
    private JButton nextBtnSignUp;
    private JPanel Login;
    private JTextField LogInStudentRefNumberTxtField;
    private JButton confirmBtnLogin;
    private JButton backBtnLogin;
    private JButton NextBtnLogin;
    private JPasswordField passwordJPasswordField;
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
    private JButton backBtnQuizSelection;
    private JComboBox quizSelector;
    private JButton nextBtnQuizSelection;
    private JPanel DigSkillsSoftDevQuestion1;
    private JPanel DigSkillsSoftDevQuiz;
    private JPanel DigSkillsCyberSecQuiz;
    private JButton DigSkillsSoftDevQuizStartBtn;
    private JButton DigSkillsSoftDevQuizBackBtn;
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
    private JRadioButton ansARadioBtnDigSkillsSoftDevQ1;
    private JButton confirmAnsBtnsDigSkillsSoftDevQ1;
    private JButton nextQBtnDigSkillsSoftDevQ1;
    private JPanel DigSkillsSoftDevQuestion2;
    private JPanel DigSkillsSoftDevQuestion3;
    private JPanel DigSkillsSoftDevQuestion4;
    private JPanel DigSkillsSoftDevQuestion5;
    private JPanel DigSkillsSoftDevQuestion6;
    private JRadioButton ansBRadioBtnDigSkillsSoftDevQ1;
    private JRadioButton ansCRadioBtnDigSkillsSoftDevQ1;
    private JRadioButton ansDRadioBtnDigSkillsSoftDevQ1;
    private JRadioButton ansARadioBtnDigSkillsSoftDevQ2;
    private JRadioButton ansBRadioBtnDigSkillsSoftDevQ2;
    private JRadioButton ansCRadioBtnDigSkillsSoftDevQ2;
    private JRadioButton ansDRadioBtnDigSkillsSoftDevQ2;
    private JRadioButton ansARadioBtnDigSkillsSoftDevQ3;
    private JRadioButton ansBRadioBtnDigSkillsSoftDevQ3;
    private JRadioButton ansCRadioBtnDigSkillsSoftDevQ3;
    private JRadioButton ansDRadioBtnDigSkillsSoftDevQ3;
    private JButton confirmAnsBtnDigSkillsSoftDevQ3;
    private JButton nextQBtnDigSkillsSoftDevQ3;
    private JRadioButton ansARadioBtnDigSkillsSoftDevQ4;
    private JRadioButton ansBRadioBtnDigSkillsSoftDevQ4;
    private JRadioButton ansCRadioBtnDigSkillsSoftDevQ4;
    private JRadioButton ansDRadioBtnDigSkillsSoftDevQ4;
    private JButton confirmAnsBtnDigSkillsSoftDevQ4;
    private JButton nextQBtnDigSkillsSoftDevQ4;
    private JRadioButton ansDRadioBtnDigSkillsSoftDevQ5;
    private JRadioButton ansCRadioBtnDigSkillsSoftDevQ5;
    private JRadioButton ansBRadioBtnDigSkillsSoftDevQ5;
    private JRadioButton ansARadioBtnDigSkillsSoftDevQ5;
    private JButton confirmAnsBtnDigSkillsSoftDevQ5;
    private JRadioButton ansARadioBtnDigSkillsSoftDevQ6;
    private JRadioButton ansBRadioBtnDigSkillsSoftDevQ6;
    private JRadioButton ansCRadioBtnDigSkillsSoftDevQ6;
    private JRadioButton ansDRadioBtnDigSkillsSoftDevQ6;
    private JButton nextQBtnDigSkillsSoftDevQ6;
    private JButton confirmAnsBtnDigSkillsSoftDevQ6;
    private JButton confirmAnsBtnDigSkillsSoftDevQ2;
    private JButton nextQBtnDigSkillsSoftDevQ2;
    private JTextPane correctAnsTxtPaneDigSkillsSoftDevQ3;
    private JTextPane correctAnsTxtPaneDigSkillsSoftDevQ2;
    private JTextPane correctAnsTxtPaneDigSkillsSoftDevQ1;
    private JButton nextQBtnDigSkillsSoftDevQ5;
    private JTextPane correctAnsTxtPaneDigSkillsSoftDevQ4;
    private JTextPane correctAnsTxtPaneDigSkillsSoftDevQ5;
    private JPanel DigSkillsSoftDevQuizScore;
    private JButton returnToQuizSelectorBtn;
    private JTextPane quizResultsTxtPane;
    private JPanel QuizResults;
    private JLabel ansBLblDigSkillsSoftDevQ2;
    private JLabel ansALblDigSkillsSoftDevQ3;
    private JLabel ansBLblDigSkillsSoftDevQ3;
    private JLabel ansCLblDigSkillsSoftDevQ3;
    private JButton confirmPasswordBtn;
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
    sets background for Study Buddy//
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
        frame.setVisible(true);


    }


    public StudyBuddy() {
        //Welcome page
        //action listener for continue button, takes user to Login or sign-up panel
        continueBtn.addActionListener(new ActionListener() {
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
        signUpBtn.addActionListener(new ActionListener() {
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
        logInBtn.addActionListener(new ActionListener() {
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
                //Creates File called fileUsernames which represents users.txt
                File fileUsernames = new File("users.txt");

                //Checks to see if the sign-up text fields are empty and throws a warning message
                if (signUpStudentReferenceTxtField.getText().isEmpty() || signUpPasswordTxtField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a username and password.");


                }
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

                //Initialises username as input from loginStudentRefNumberTxtField and password as input from passwordJPasswordField
                String username = LogInStudentRefNumberTxtField.getText();
                String password = String.valueOf(passwordJPasswordField.getPassword());


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

                            try {
                                //Creates FileReader called reader which represents LogInStudentRefNumberTxtField input text field
                                FileReader reader = new FileReader(LogInStudentRefNumberTxtField.getText() + ".txt");
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
                    passwordJPasswordField.setEchoChar((char) 0);
                } else {
                    passwordJPasswordField.setEchoChar('*');
                }
            }
        });
        //Moves onto either lecturers view or profile panel when pressed
        NextBtnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Checks to see if it is an integer, if it is then it will move onto the Profile page, if not then it will move onto Lecturers View page
                if (LogInStudentRefNumberTxtField.getText().matches("\\d+")) {
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
                LogInStudentRefNumberTxtField.setText("");
                signUpPasswordTxtField.setText("");
                passwordJPasswordField.setText("");
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


        //Confirms and displays the users full name when pressed
        confirmBtnName.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
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

                //creates a new File called fileNames which represents signUpStudentsReferenceTxtField.getText() text file and writes the users name, grades, total, whether they are on target and pass percentage to the file
                File fileNames = new File(signUpStudentReferenceTxtField.getText() + ".txt");
                try {
                    FileOutputStream fOut = new FileOutputStream(fileNames, true);
                    OutputStreamWriter osw = new OutputStreamWriter(fOut);
                    osw.write(fullName + ", " + DigSkillsSoftwareDevTheory.getSelectedItem() + ", " + DigSkillsSoftwareDevPrac.getSelectedItem() + ", " + DigSkillsCyberGrade.getSelectedItem() + ", " + DigSkillsCompSciGrade.getSelectedItem() + ", " + DigSkillsDataGrade.getSelectedItem() + ", " + iotTheoryGrade.getSelectedItem() + ", " + iotPracticalGrade.getSelectedItem() + ", " + networkTheory.getSelectedItem() + ", " + networkPractical.getSelectedItem() + ", " + compSciGrade.getSelectedItem() + ", " + CloudCompTheoryGrade.getSelectedItem() + ", " + cloudCompPrac.getSelectedItem() + ", " + SoftDevTheoryGrade.getSelectedItem() + ", " + SoftDevPracticalGrade.getSelectedItem() + ", " + ProPractGrade.getSelectedItem() + ", " + total + ", " + index + ", " + percentagePass + ", ");
                    osw.flush();
                    osw.close();
                } catch (Exception e2) {

                }


            }
        });


        //takes user back to sign-up panel when pressed
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


        // next button to move onto Login panel when pressed
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


        // back button to move onto Profile panel when pressed
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


        //Confirms the users input, disables the confirm button and JComboBox for grades, enables the retry and next button, finds which number the input would equal and adds it to a total when pressed
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

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 3
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

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 3
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

        //Resets the score back to before the confirm button was pressed, enables the confirm button and the JComboBox and disables the retry button when pressed
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

                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 3
                should be subtracted to the total
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
                /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 3
                should be subtracted to the total
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
        // next button to move onto digital skills cyber security page when pressed
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


        // back button to move backk to digital skills software dev page when pressed
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


        //Confirms the users input, finds which number the input would equal and adds it to a total when pressed
        confirmBtnDSCS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                DigSkillsCyberSecRetryBtn.setEnabled(true);
                DigSkillsCyberGrade.setEnabled(false);
                NextBtnCyber.setEnabled(true);
                confirmBtnDSCS.setEnabled(false);

                int DigSkillsCyberSecure = 0;

               /*Checks to see if grade is either a "Pass.", "Fail. (Attempt 1)", "Fail. (Attempt 2)" or "Fail. (Attempt 3)" to determine if 1,2 3
                should be added to the total
                 */
                if (DigSkillsCyberGrade.getSelectedItem() == "Pass.") {
                    DigSkillsCyberSecure += 3;
                }
                else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    DigSkillsCyberSecure += 2;
                }
                else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    DigSkillsCyberSecure += 1;
                }
                else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    DigSkillsCyberSecure += 0;
                }

                //Updates total and displays Digital Skills: Cyber Security total
                total = total + DigSkillsCyberSecure;
                dscsLbl.setText(String.valueOf(DigSkillsCyberSecure));
                NextBtnCyber.setEnabled(true);

            }
        });

        //Resets the score back to before the confirm button was pressed, enables the confirm button and the JComboBox and disables the retry button when pressed
        DigSkillsCyberSecRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                confirmBtnDSCS.setEnabled(true);
                NextBtnCyber.setEnabled(false);
                DigSkillsCyberSecRetryBtn.setEnabled(false);
                DigSkillsCyberGrade.setEnabled(true);


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
        //next button to data science when pressed
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

        //Moves back to digital skills cyber security page when pressed
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

                DigSkillsCompSciGrade.setEnabled(false);
                confirmBtnDigSkillsCompSci.setEnabled(false);
                DigSkillsCompSciRetryBtn.setEnabled(true);
                nextBtnDigSkillsCompSci.setEnabled(true);

                int DigSkillsCompSci = 0;

                /*Checks to see if the Digital Skills: Computer Science = "Pass."
                 Adds 3  to total if Digital Skills: Computer Science grade = "Pass."
                 */

                if (DigSkillsCompSciGrade.getSelectedItem() == "Pass.") {
                    DigSkillsCompSci += 3;
                }
                /*Checks to see if the Digital Skills: Computer Science = "Fail. (Attempt 1)"
                 Adds 2  to total if Digital Skills: Computer Science grade = "Fail. (Attempt 1)"
                 */
                else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    DigSkillsCompSci += 2;
                }
                /*Checks to see if the Digital Skills: Computer Science = "Fail. (Attempt 2)"
                 Adds 1  to total if Digital Skills: Computer Science grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    DigSkillsCompSci += 1;
                }
                /*Checks to see if the Digital Skills: Computer Science = "Fail. (Attempt 3)"
                 Adds 0  to total if Digital Skills: Computer Science grade = "Fail. (Attempt 3)"
                 */
                else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    DigSkillsCompSci += 0;
                }

                //Updates total and displays Digital Skills: Computing Science total
                total = total + DigSkillsCompSci;
                DigSkillsCompSciLbl.setText(String.valueOf(DigSkillsCompSci));
                nextBtnDigSkillsCompSci.setEnabled(true);
            }
        });
        //Resets the score back to before the confirm button was pressed, enables the confirm button and the JComboBox and disables the retry button when pressed
        DigSkillsCompSciRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                confirmBtnDigSkillsCompSci.setEnabled(true);
                nextBtnDigSkillsCompSci.setEnabled(false);
                DigSkillsCompSciRetryBtn.setEnabled(false);
                DigSkillsCompSciGrade.setEnabled(true);


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

        //Moves onto the digital skills data science page when pressed
        nextBtnDigSkillsCompSci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigSkillsDataScience);
                Background.repaint();
                Background.revalidate();
            }
        });

        // back btn to cyber
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

        confirmBtnDataScience.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                DigSkillsDataGrade.setEnabled(false);

                NextBtnData.setEnabled(true);
                confirmBtnDataScience.setEnabled(false);
                DigSkillsDataSciRetryBtn.setEnabled(true);


                int total2 = 0;

                if (DigSkillsDataGrade.getSelectedItem() == "Pass.") {
                    total2 = total2 + 3;
                } else if (DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total2 = total2 + 2;
                } else if (DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total2 = total2 + 1;
                }
                DataLbl.setText(String.valueOf(total2));
                total = total + total2;
                NextBtnData.setEnabled(true);
            }
        });
        //Resets the score back to before the confirm button was pressed, enables the confirm button and the JComboBox and disables the retry button when pressed
        DigSkillsDataSciRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DigSkillsDataGrade.setEnabled(true);

                DigSkillsDataSciRetryBtn.setEnabled(false);

                confirmBtnDataScience.setEnabled(true);
                NextBtnData.setEnabled(false);

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

        // next btn to IoT
        NextBtnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(IoT);
                Background.repaint();
                Background.revalidate();
            }
        });


        // back btn to data sci
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


        confirmBtnIoT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                IotRetryBtn.setEnabled(true);
                nextButtonIoT.setEnabled(true);


                confirmBtnIoT.setEnabled(false);
                iotPracticalGrade.setEnabled(false);
                iotTheoryGrade.setEnabled(false);
                int Total3 = 0;

                if (iotTheoryGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                if (iotPracticalGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                total = total + Total3;
                IotLbl.setText(String.valueOf(Total3));
                nextButtonIoT.setEnabled(true);
            }
        });

        //Resets the score back to before the confirm button was pressed, enables the confirm button and the JComboBox and disables the retry button when pressed
        IotRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextButtonIoT.setEnabled(false);
                IotRetryBtn.setEnabled(false);
                iotTheoryGrade.setEnabled(true);
                iotPracticalGrade.setEnabled(true);
                confirmBtnIoT.setEnabled(true);

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

        // next btn to network infra
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

        // back btn to IoT
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

        //Resets the score back to before the confirm button was pressed, enables the confirm button and the JComboBox and disables the retry button when pressed
        confirmBtnNetworkInfrastructure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                networkTheory.setEnabled(false);
                networkPractical.setEnabled(false);

                networkNextButton.setEnabled(true);
                confirmBtnNetworkInfrastructure.setEnabled(false);
                networkRetryBtn.setEnabled(true);
                int Total3 = 0;

                if (networkTheory.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (networkTheory.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (networkTheory.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (networkTheory.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                if (networkPractical.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (networkPractical.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (networkPractical.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (networkPractical.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                total = total + Total3;
                NetworkLbl.setText(String.valueOf(Total3));

            }
        });

        networkRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmBtnNetworkInfrastructure.setEnabled(true);
                networkTheory.setEnabled(true);
                networkPractical.setEnabled(true);

                networkRetryBtn.setEnabled(false);
                networkNextButton.setEnabled(false);

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

        // next btn to comp sci
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


        // back btn to network infra
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

        confirmBtnComputerScience.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                compSciGrade.setEnabled(false);
                confirmBtnComputerScience.setEnabled(false);
                RetryCompScienceBtn.setEnabled(true);


                int Total3 = 0;


                if (compSciGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }
                total = total + Total3;
                compSciLbl.setText(String.valueOf(Total3));
                compSciNextButton.setEnabled(true);
            }
        });

        //Resets the score back to before the confirm button was pressed, enables the confirm button and the JComboBox and disables the retry button when pressed
        RetryCompScienceBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                confirmBtnComputerScience.setEnabled(true);
                compSciGrade.setEnabled(true);

                RetryCompScienceBtn.setEnabled(false);
                compSciNextButton.setEnabled(false);

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

        // next btn to cloud comp
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


        // back btn to comp sci
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

        confirmBtnCloudComputing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CloudCompTheoryGrade.setEnabled(false);
                cloudCompPrac.setEnabled(false);

                NextBtnCloud.setEnabled(true);
                confirmBtnCloudComputing.setEnabled(false);
                RetryCloudBtn.setEnabled(true);


                int Total3 = 0;
                if (CloudCompTheoryGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }
                if (cloudCompPrac.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (cloudCompPrac.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (cloudCompPrac.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (cloudCompPrac.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }
                total = total + Total3;
                cloudCompLbl.setText(String.valueOf(Total3));

            }
        });
        RetryCloudBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CloudCompTheoryGrade.setEnabled(true);
                cloudCompPrac.setEnabled(true);
                confirmBtnCloudComputing.setEnabled(true);

                RetryCloudBtn.setEnabled(false);
                NextBtnCloud.setEnabled(false);

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
        // next btn to soft dev
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


        // back btn to cloud comp
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

        confirmBtnSoftwareDevelopment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SoftDevTheoryGrade.setEnabled(false);
                SoftDevPracticalGrade.setEnabled(false);


                int Total3 = 0;

                if (SoftDevTheoryGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                if (SoftDevPracticalGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                total = total + Total3;
                softDevLbl.setText(String.valueOf(Total3));
                NextBtnSoftDev.setEnabled(true);

                confirmBtnSoftwareDevelopment.setEnabled(false);
                SoftDevRetryBtn.setEnabled(true);
                SoftDevTheoryGrade.setEnabled(false);
                SoftDevPracticalGrade.setEnabled(false);


            }
        });

        SoftDevRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SoftDevTheoryGrade.setEnabled(true);
                SoftDevPracticalGrade.setEnabled(true);
                confirmBtnSoftwareDevelopment.setEnabled(true);
                SoftDevRetryBtn.setEnabled(false);
                NextBtnSoftDev.setEnabled(false);

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
                SoftDevTheoryGrade.setEnabled(true);
                SoftDevPracticalGrade.setEnabled(true);

            }
        });
        // next btn to pro practice
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

        // back btn to software dev
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
        confirmBtnProfessionalPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Total3 = 0;

                if (ProPractGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                total = total + Total3;
                ProfPracticeLbl.setText(String.valueOf(Total3));
                NextBtnProfPractice.setEnabled(true);
                RetrybtnProfPrac.setEnabled(true);
                ProPractGrade.setEnabled(true);


                confirmBtnProfessionalPractice.setEnabled(false);
            }
        });
        RetrybtnProfPrac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmBtnProfessionalPractice.setEnabled(true);
                NextBtnProfPractice.setEnabled(false);
                RetrybtnProfPrac.setEnabled(false);

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


            }//
        });
        // next btn to results
        NextBtnProfPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds Summary panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Summary);
                Background.repaint();
                Background.revalidate();


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

                SummaryTxtAreaInfo.setText("We have assigned each grade with a value to help calculate if you are on track to \npass. After selecting and confirming a grade, we add the number assigned to that \ngrade to the total and if this total is above our threshold of 33 then you are on track to \npass, if below our threshold of 33 then you may still be able to pass, however you are \ncurrently on course for a pass.");
            }
        });


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


        nextBtnSummary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds results panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Results);
                Background.repaint();
                Background.revalidate();


                passPercentage = (total * 100) / 45;
                roundOffPassPercentage = Math.round(passPercentage * 100.0) / 100.0;
                percentagePass = (int) roundOffPassPercentage;

                if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 3)" || DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 3)" || DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 3)" || DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 3)" || DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 3)" || iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 3)" || iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)" || networkTheory.getSelectedItem() == "Fail. (Attempt 3)" || networkPractical.getSelectedItem() == "Fail. (Attempt 3)" || compSciGrade.getSelectedItem() == "Fail. (Attempt 3)" || CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)" || SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 3)" || SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)" || ProPractGrade.getSelectedItem() == "Fail. (Attempt 3)" || total < 31) {
                    index = 2;
                } else if (total >= 32) {
                    index = 1;
                }


                double passPercentage = (total * 100) / 45;
                double roundOffPassPercentage = Math.round(passPercentage * 100.0) / 100.0;
                int percentagePass = (int) roundOffPassPercentage;

                ResultsTxtAreaInfo.setText("The total is calculated by adding on a set value dependant on the grade and \nattempt, to be on target, you must have a total of 33 or higher and must have \ngreater than a fail attempt 3.");
                ResultsTxtAreaName.setText("Name\n" + fullName);
                ResultsTxtAreaTotal.setText("Total\n" + total);
                ResultsTxtAreaOnTarget.setText("On Target\n" + onTarget[index]);
                ResultsTxtAreaPassPercentage.setText("Pass Percentage\n" + percentagePass + "%");
            }
        });


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

        saveBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File studenRefNo = new File(LogInStudentRefNumberTxtField.getText() + ".txt");
                try {
                    FileOutputStream fOut = new FileOutputStream(studenRefNo, false);
                    OutputStreamWriter osw = new OutputStreamWriter(fOut);
                    osw.write(fullName + ", " + DigSkillsSoftwareDevTheory.getSelectedItem() + ", " + DigSkillsSoftwareDevPrac.getSelectedItem() + ", " + DigSkillsCyberGrade.getSelectedItem() + ", " + DigSkillsCompSciGrade.getSelectedItem() + ", " + DigSkillsDataGrade.getSelectedItem() + ", " + iotTheoryGrade.getSelectedItem() + ", " + iotPracticalGrade.getSelectedItem() + ", " + networkTheory.getSelectedItem() + ", " + networkPractical.getSelectedItem() + ", " + compSciGrade.getSelectedItem() + ", " + CloudCompTheoryGrade.getSelectedItem() + ", " + cloudCompPrac.getSelectedItem() + ", " + SoftDevTheoryGrade.getSelectedItem() + ", " + SoftDevPracticalGrade.getSelectedItem() + ", " + ProPractGrade.getSelectedItem() + ", " + total + ", " + index + ", " + percentagePass + ", ");
                    osw.flush();
                    osw.close();
                } catch (Exception e2) {
                }
            }
        });
        editGradesBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds digital skills software development panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(DigitalSkillsSoftwareDev);
                Background.repaint();
                Background.revalidate();

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
        signOutBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Clearing all text areas after sign out.
                signUpStudentReferenceTxtField.setText("");
                LogInStudentRefNumberTxtField.setText("");
                signUpPasswordTxtField.setText("");
                passwordJPasswordField.setText("");
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





        nextBtnQuizSelection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Getting the user's input from the quizSelector jComboBox to work out which quiz the user wants to attempt
                if (quizSelector.getSelectedItem() == "Digital Skills: Software Development.") {
                    DigSkillsSoftDevQuiz prog = new DigSkillsSoftDevQuiz();
                    prog.DigSkillsSoftDevQuizQ1();
                }else if (quizSelector.getSelectedItem() == "Digital Skills: Cyber Security.") {
                    DigSkillsCyberSecQuiz prog = new DigSkillsCyberSecQuiz();
                    prog.DigSkillsCyberSecQuizQ1();
                }else if (quizSelector.getSelectedItem() == "Digital Skills: Computer Science.") {
                    DigSkillsCompSciQuiz prog = new DigSkillsCompSciQuiz();
                    prog.DigSkillsCompSciQ1();
                }else if (quizSelector.getSelectedItem() == "Digital Skills: Data Science.") {
                    DigSkillsDataSciQuiz prog  = new DigSkillsDataSciQuiz();
                    prog.DigSkillsDataSciQuizQ1();
                }else if (quizSelector.getSelectedItem() == "Internet of Things.") {
                    IoTQuiz prog = new IoTQuiz();
                    prog.IoTQuizQ1();
                }else if (quizSelector.getSelectedItem() == "Network Infrastructure.") {
                    NetworkInfraQuiz prog  = new NetworkInfraQuiz();
                    prog.NetworkInfraQ1();
                }else if (quizSelector.getSelectedItem() == "Computer Science.") {
                    ComputerScienceQuiz prog  = new ComputerScienceQuiz();
                    prog.ComputerScienceQuizQ1();
                }else if (quizSelector.getSelectedItem() == "Cloud Computing.") {
                    CloudComputingQuiz prog = new CloudComputingQuiz();
                    prog.CloudComputingQuizQ1();
                }else if (quizSelector.getSelectedItem() == "Software Development.") {
                    SoftwareDevelopmentQuiz prog = new SoftwareDevelopmentQuiz();
                    prog.SoftDevQuizQ1();
                }else if (quizSelector.getSelectedItem() == "Professional Practice.") {
                    ProfessionalPracticeQuiz prog = new ProfessionalPracticeQuiz();
                    prog.ProfessionalPracticeQuizQ1();
                }else {
                    JOptionPane.showMessageDialog(null, "There was no quiz selected!");
                }


            }

        });


        //Loads user profile and displays grades, full name, total, whether they are on target and their percentage pass when pressed
        loadUserLecturers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    //Creates FileReader called reader which represents LogInStudentRefNumberTxtField input text field
                    FileReader reader = new FileReader(studentRefComboBoxLecturers.getSelectedItem() + ".txt");
                    //Creates new BufferedReader called br which represents reader
                    BufferedReader br = new BufferedReader(reader);

                    //Initialises lineRead as br.readLine() and partsRead array as lineRead.split which would be split by ", "
                    String lineRead = br.readLine();
                    String[] partsRead = lineRead.split(", ");


                    //Reads the data from the account's text file and sets it to the fullName, grades, total, onTarget and percentagePass variables.


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

                    nameTxtAreaLecturers.setText("Name\n" + partsRead[0]);
                    totalTxtAreaLecturers.setText("total\n" + partsRead[16]);
                    onTargetTxtAreaLecturers.setText("On Target\n" + onTarget[index]);
                    passPercentageTxtAreaLecturers.append("Pass Percentage\n" + partsRead[18]);






                }
                //If there is an error reading from the file and setting the data to the fullName, grades, total, onTarget and percentagePass variables
                catch (Exception e2) {
                    System.out.println(e2);


                }

            }


        });
        //Moves back to the Login page when pressed
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
        //Resets variables, JComboBox and textFields and moves back to welcome page when pressed.
        signOutBtnLecturers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removes previous panel, adds welcome panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Welcome);
                Background.repaint();
                Background.revalidate();

                signUpStudentReferenceTxtField.setText("");
                LogInStudentRefNumberTxtField.setText("");
                signUpPasswordTxtField.setText("");
                passwordJPasswordField.setText("");
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
    }


}

