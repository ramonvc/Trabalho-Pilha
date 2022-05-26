public class Main {
    public static void main(String[] args) {
        Contact professorLindoDoMeuCoracao = new Contact("Gerente da OLX", "4002-8922", "aallan@univille.br");

        Story storyDoProfesssorLindoDoMeuCoracao = new Story(6);
        storyDoProfesssorLindoDoMeuCoracao.push(professorLindoDoMeuCoracao.toString());

        professorLindoDoMeuCoracao.setName("alan");
        professorLindoDoMeuCoracao.setPhone("9566523");
        professorLindoDoMeuCoracao.setEmail("allan@univille.br");
        storyDoProfesssorLindoDoMeuCoracao.push(professorLindoDoMeuCoracao.toString());
        storyDoProfesssorLindoDoMeuCoracao.pop();

        professorLindoDoMeuCoracao.setName("alanzoka");
        professorLindoDoMeuCoracao.setPhone("12345678");
        professorLindoDoMeuCoracao.setEmail("dcruz@univille.br");
        storyDoProfesssorLindoDoMeuCoracao.push(professorLindoDoMeuCoracao.toString());

        professorLindoDoMeuCoracao.setName("alanzoka");
        professorLindoDoMeuCoracao.setPhone("846515");
        professorLindoDoMeuCoracao.setEmail("allan@udesc.br");
        storyDoProfesssorLindoDoMeuCoracao.push(professorLindoDoMeuCoracao.toString());
        storyDoProfesssorLindoDoMeuCoracao.CtrlZ();
        storyDoProfesssorLindoDoMeuCoracao.CtrlZ();
        storyDoProfesssorLindoDoMeuCoracao.CtrlZ();
        storyDoProfesssorLindoDoMeuCoracao.CtrlY();
        storyDoProfesssorLindoDoMeuCoracao.CtrlY();

        professorLindoDoMeuCoracao.setEmail("aallan@olx.br");
        storyDoProfesssorLindoDoMeuCoracao.push(professorLindoDoMeuCoracao.toString());

        System.out.println(storyDoProfesssorLindoDoMeuCoracao.toString());
    }
}
