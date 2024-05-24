//Como fazer testes automatizados do exercício anterior?

//Para isso vamos usar a propria biblioteca do Swing. No arquivo FatorialView, instanciamos dois métodos: um do tipo JTextField, getTextField(), outro do tipo Jbutton, getButton(). Para testar a GUI, criamos a classe FatorialViewTest. Neste arquivo, instanciamos a classe FatorialView e usamos os metodos .setText() e .doClick() para simular a execução padrão do usuário, com 1 segundo de espera entre cada execução (tendo os casos de exceção um tempo ligeiramente maior para conferir as mensagens de erro).



//Qual a diferença dessa categoria de teste com os testes usando o JUnit que estávamos fazendo até agora?

//A principal diferença está no fato de que os testes em JUnit servem para testar individualmente cada parte do código, com valores de resultados já esperados, enquanto o teste de aceitação irá testar o funcionamento do programa como um todo, neste caso a interação do usuário com a interface gráfica, simulando a execução do usuário e verificando se a interface responde como esperado. Em suma, podemos dizer que um teste de aceitação testa o sistema/programa como um todo, enquanto o teste unitário (como o JUnit) testa partes específicas do código, visando encontrar possíveis falhas no funcionamento do código.



//Como o usuário deve proceder?

//O usuário deve executar o teste e verificar se o programa responde corretamente a cada entrada de número, verificando se o alerta das exceções para números negativos e números maiores que 20 aparecem na interface.


package ex2;

import ex1.FatorialView;
import javax.swing.*;

public class FatorialViewTest {

    public static void main(String[] args) {
        // Instancie a classe FatorialView
        FatorialView fatorialView = new FatorialView();

        // Exiba a GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                fatorialView.show();
            }
        });

        //aguardar antes da tela ser exibida
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        for (int i = -1; i < 22; i++) {

            //converte cada numero para uma string que irá para a caixa de texto
            fatorialView.getTextField().setText(Integer.toString(i));

            //clica no botão
            fatorialView.getButton().doClick();
            
            //aguarda 2s antes de ir para o próximo número
            try {
                //tempo extra para verificar as exceções
                if(i == -1 || i == 21){
                    Thread.sleep(2000);
                }
                else{
                Thread.sleep(600);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}