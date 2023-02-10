
    import java.time.LocalDate;
    import java.time.Period;
    import java.time.format.DateTimeFormatter;
    import java.time.format.DateTimeParseException;
    import java.time.temporal.ChronoUnit;
    import java.util.Scanner;

    /*Faça um programa que receba o ano de nascimento de uma pessoa 
    e o ano atual, calcule e mostre: 
    a. a idade dessa pessoa em anos; 
    b. a idade dessa pessoa em meses; 
    c. a idade dessa pessoa em dias (considerando que cada ano possui 365 dias); 
    d. a idade dessa pessoa em semanas (cada ano possui 52 semanas). */
    
    public class anoNascimento {
        public static void main(String[] args) {
            try (Scanner scan = new Scanner(System.in)) {
                String dataNascimento;
                LocalDate dtNascimento = null;
    
                while (dtNascimento == null) {
                    System.out.println("Informe sua data de nascimento (dd/MM/yyyy):");
                    dataNascimento = scan.nextLine();
                    try {
                        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        dtNascimento = LocalDate.parse(dataNascimento, formatoData);
                    } catch (DateTimeParseException e) {
                        System.out.println("Data inválida! Por favor, informe a data no formato dd/MM/yyyy.");
                    }
                }
    
                // Pega a data atual
                LocalDate dataAtual = LocalDate.now();
    
                // Calcula a diferença entre as datas
                Period periodo = Period.between(dtNascimento, dataAtual);
    
                System.out.println("Você tem: " + periodo.getYears() + " anos, "
                        + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
    
                // Calcula a diferença em semanas
                long semanas = ChronoUnit.WEEKS.between(dtNascimento, dataAtual);
                System.out.println("Quantidade de semanas: " + semanas);
            }
        }
    }
    