public class Main {
    public static void main(String[] args) {
        Contact professorLindoDoMeuCoracao = new Contact("Gerente da OLX", "4002-8922", "aallan@univille.br");

        Story storyDoProfesssorLindoDoMeuCoracao = new Story(6);
        storyDoProfesssorLindoDoMeuCoracao.push(professorLindoDoMeuCoracao.toString());

        professorLindoDoMeuCoracao.setName("Alan");
        professorLindoDoMeuCoracao.setPhone("(47)98899-0000");
        professorLindoDoMeuCoracao.setEmail("alan@univille.br");
        storyDoProfesssorLindoDoMeuCoracao.push(professorLindoDoMeuCoracao.toString());
        storyDoProfesssorLindoDoMeuCoracao.pop();

        professorLindoDoMeuCoracao.setName("Alanzoka");
        professorLindoDoMeuCoracao.setPhone("(11)92233-1122");
        professorLindoDoMeuCoracao.setEmail("alanzoka@twitch.tv");
        storyDoProfesssorLindoDoMeuCoracao.push(professorLindoDoMeuCoracao.toString());

        professorLindoDoMeuCoracao.setName("Alanzoka");
        professorLindoDoMeuCoracao.setPhone("(44)98899-0000");
        professorLindoDoMeuCoracao.setEmail("allan@udesc.br");
        storyDoProfesssorLindoDoMeuCoracao.push(professorLindoDoMeuCoracao.toString());
        storyDoProfesssorLindoDoMeuCoracao.CtrlZ();

        professorLindoDoMeuCoracao.setEmail("aallan@olx.br");
        storyDoProfesssorLindoDoMeuCoracao.push(professorLindoDoMeuCoracao.toString());

        professorLindoDoMeuCoracao.setName("Alanzito");
        storyDoProfesssorLindoDoMeuCoracao.push(professorLindoDoMeuCoracao.toString());
        storyDoProfesssorLindoDoMeuCoracao.CtrlZ();
        storyDoProfesssorLindoDoMeuCoracao.CtrlY();
        System.out.println(storyDoProfesssorLindoDoMeuCoracao.toString());
    }
}
