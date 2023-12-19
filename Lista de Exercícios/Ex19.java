    import javax.swing.JOptionPane;

    class Aluno {

        private String nome;
        private double nota;

        public Aluno(String nome, double nota) {
            this.nome = nome;
            this.nota = nota;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getNota() {
            return nota;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }
    }

    public class Ex19 {

        public static void main(String[] args) {
            String aluString = JOptionPane.showInputDialog("Digite o nome do aluno");
            int notaAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno"));
            Aluno aluno = new Aluno(aluString, notaAluno);

            Aluno copia = copiarAluno(aluno);
            copia.setNome(JOptionPane.showInputDialog("Nome da cópia:"));

            try {
                copia.setNota(Double.parseDouble(JOptionPane.showInputDialog("Nota da cópia:")));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Insira uma nota válida.");
                System.exit(1);
            }

            JOptionPane.showMessageDialog(null, "Aluno original:");
            JOptionPane.showMessageDialog(null, "Nome: " + aluno.getNome());
            JOptionPane.showMessageDialog(null, "Nota: " + aluno.getNota());

            JOptionPane.showMessageDialog(null, "Cópia:");
            JOptionPane.showMessageDialog(null, "Nome: " + copia.getNome());
            JOptionPane.showMessageDialog(null, "Nota: " + copia.getNota());
        }

        public static Aluno copiarAluno(Aluno aluno) {
            return new Aluno(aluno.getNome(), aluno.getNota());
        }
    }
