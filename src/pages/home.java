package pages;

public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        registerCourseBtn = new javax.swing.JMenu();
        registerDisciplineBtn = new javax.swing.JMenu();
        registerStudentBtn = new javax.swing.JMenu();
        registerTeacherBtn = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        showCourse = new javax.swing.JMenu();
        showDiscipline = new javax.swing.JMenu();
        showStudent = new javax.swing.JMenu();
        showTeacher = new javax.swing.JMenu();
        showCP = new javax.swing.JMenu();
        showCD = new javax.swing.JMenu();
        showPD = new javax.swing.JMenu();
        showAD = new javax.swing.JMenu();
        exitBtn = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seja bem vindo ao EducaMais");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("O melhor sistema de ensino");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(343, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 255));
        jMenuBar1.setBorder(null);

        jMenu1.setForeground(new java.awt.Color(238, 238, 238));
        jMenu1.setText("CADASTRAR");

        registerCourseBtn.setText("Curso");
        registerCourseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerCourseBtnMouseClicked(evt);
            }
        });
        jMenu1.add(registerCourseBtn);

        registerDisciplineBtn.setText("Disciplina");
        registerDisciplineBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerDisciplineBtnMouseClicked(evt);
            }
        });
        jMenu1.add(registerDisciplineBtn);

        registerStudentBtn.setText("Aluno");
        registerStudentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerStudentBtnMouseClicked(evt);
            }
        });
        jMenu1.add(registerStudentBtn);

        registerTeacherBtn.setText("Professor");
        registerTeacherBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerTeacherBtnMouseClicked(evt);
            }
        });
        jMenu1.add(registerTeacherBtn);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(238, 238, 238));
        jMenu2.setText("MOSTRAR");

        showCourse.setText("Curso");
        showCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showCourseMouseClicked(evt);
            }
        });
        jMenu2.add(showCourse);

        showDiscipline.setText("Disciplina");
        showDiscipline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDisciplineMouseClicked(evt);
            }
        });
        jMenu2.add(showDiscipline);

        showStudent.setText("Aluno");
        showStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showStudentMouseClicked(evt);
            }
        });
        jMenu2.add(showStudent);

        showTeacher.setText("Professor");
        showTeacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showTeacherMouseClicked(evt);
            }
        });
        jMenu2.add(showTeacher);

        showCP.setText("Cursos/Professores");
        showCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showCPMouseClicked(evt);
            }
        });
        jMenu2.add(showCP);

        showCD.setText("Cursos/Disciplinas");
        showCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showCDMouseClicked(evt);
            }
        });
        jMenu2.add(showCD);

        showPD.setText("Professores/Disciplinas");
        showPD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPDMouseClicked(evt);
            }
        });
        jMenu2.add(showPD);

        showAD.setText("Aluno/Disciplina");
        showAD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showADMouseClicked(evt);
            }
        });
        jMenu2.add(showAD);

        jMenuBar1.add(jMenu2);

        exitBtn.setForeground(new java.awt.Color(238, 238, 238));
        exitBtn.setText("SAIR");
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        jMenuBar1.add(exitBtn);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // Exit Button
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void registerCourseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerCourseBtnMouseClicked
        // TODO add your handling code here:
        registerCourse regCourse = new registerCourse();
        regCourse.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerCourseBtnMouseClicked

    private void registerDisciplineBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerDisciplineBtnMouseClicked
        // TODO add your handling code here:
        registerDiscipline regDiscipline = new registerDiscipline();
        regDiscipline.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerDisciplineBtnMouseClicked

    private void registerStudentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerStudentBtnMouseClicked
        // TODO add your handling code here:
        registerStudent regStudant = new registerStudent();
        regStudant.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerStudentBtnMouseClicked

    private void registerTeacherBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerTeacherBtnMouseClicked
        // TODO add your handling code here:
        registerTeacher regTeacher = new registerTeacher();
        regTeacher.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerTeacherBtnMouseClicked

    private void showCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showCourseMouseClicked
        // TODO add your handling code here:
        showCourse mostrarCursos = new showCourse();
        mostrarCursos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_showCourseMouseClicked

    private void showDisciplineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDisciplineMouseClicked
        // TODO add your handling code here:
        showDisciplines mostrarDisciplinas = new showDisciplines();
        mostrarDisciplinas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_showDisciplineMouseClicked

    private void showStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showStudentMouseClicked
        // TODO add your handling code here:
        showStudents mostrarAlunos = new showStudents();
        mostrarAlunos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_showStudentMouseClicked

    private void showTeacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showTeacherMouseClicked
        // TODO add your handling code here:
        showTeachers mostrarProfessores = new showTeachers();
        mostrarProfessores.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_showTeacherMouseClicked

    private void showCPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showCPMouseClicked
        // TODO add your handling code here:
        showCP mostrarCP = new showCP();
        mostrarCP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_showCPMouseClicked

    private void showCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showCDMouseClicked
        // TODO add your handling code here:
        showCD mostrarCP = new showCD();
        mostrarCP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_showCDMouseClicked

    private void showPDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPDMouseClicked
        // TODO add your handling code here:
        showPD mostrarPD = new showPD();
        mostrarPD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_showPDMouseClicked

    private void showADMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showADMouseClicked
        // TODO add your handling code here:
        showAD mostrarAD = new showAD();
        mostrarAD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_showADMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu registerCourseBtn;
    private javax.swing.JMenu registerDisciplineBtn;
    private javax.swing.JMenu registerStudentBtn;
    private javax.swing.JMenu registerTeacherBtn;
    private javax.swing.JMenu showAD;
    private javax.swing.JMenu showCD;
    private javax.swing.JMenu showCP;
    private javax.swing.JMenu showCourse;
    private javax.swing.JMenu showDiscipline;
    private javax.swing.JMenu showPD;
    private javax.swing.JMenu showStudent;
    private javax.swing.JMenu showTeacher;
    // End of variables declaration//GEN-END:variables
}
