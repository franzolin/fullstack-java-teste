No arquivo README do projeto
- explique o funcionamento e a
- arquitetura da solução adotada na sua implementação.
Descreva também os passos para executar corretamente seu projeto.

### Arquitetura adotada
##### Back-end
Optei pela [opção 2](https://github.com/contabilizei/fullstack-java-teste#back-end) usando como banco de dados o **MongoDB**
##### Front-end
Optei por usar **Angular Material Design**

### Para executar
> É necessário instalar o MongoDB  e o Maven

Usando o Intellij:
 1. importe o projeto como um *Maven Project*, após isso vá em
 - Run (barra superior) -> Edit Configuration
 - Alt + insert ou **+** -> Tomcat Server -> local
 - Click no botão **Fix** -> fullstack-java-teste:war exploded -> Apply -> OK
 - Por fim Run(barra superior) -> Run
 - O browser configurado já sera aberto com a pagina


### Funcionamento
Tudo esta em apenas uma pagina, para fazer o pedido basta incluir todos os dados no topo da página e clickar no **Adicionar pedido**

Os pedidos já feitos aparecem listados na parte inferior. A atualiza automaticamento conforme novos pedidos são inseridos

### Tutoriais Usados para implementar o CRUD
- [Material Angular](https://material.angularjs.org/latest/demo/input)
- [Form material](http://www.bossable.com/1745/angularjs-material-design-contact-form/)
- [Java + MongoDB](http://www.mkyong.com/tutorials/java-mongodb-tutorials/)
- [JAX-RS](https://www.mkyong.com/webservices/jax-rs/jersey-hello-world-example/)

### Plano de trabalho
#### Front-end
- [x] Entender AngularJS para fazer v0
- [x] Concluir v0 com layout sem css
- [x] Usar Angulas Material Design design para deixar a tela apresentavel
- [x] Fazer lista dinamica para criacao de lista de produtos
- [x] Fazer HTTPrequest - Listagem
- [x] Fazer HTTPrequest - Inclusão
- [ ] Implementar controllers
- [ ] Fazer HTTPrequest - Exclusão
- [ ] Fazer HTTPrequest - Alteração
- [ ] Fazer funcao para limpar o form
#### Back-end
- [x] Implementar aplicacao JavaEE que lê e escreve do MongoDB
- [x] Implementar insercao, exclusao e listagem no JavaEE (Pedidos)
- [x] Entender o JAX-RS e fazer um exemplo básico
- [x] Integra com o JAX-Rs
- [ ] Fazer um conector no Java para gerenciar acesso ao banco
