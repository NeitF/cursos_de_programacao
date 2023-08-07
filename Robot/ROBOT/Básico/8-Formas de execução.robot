# Para executar um teste e criar os logs em outra pasta sem ser a pasta raiz:
# No terminal: robot -d NomeDaPasta NomeDoArquivoDeTeste
# robot -d result bdd.robot


# Executar apenas um cenário específico de um teste
# No terminal: robot -d PastaParaArmazenarlogs -t "NomeDoCenario" ArquivoDoTeste
# robot -d result -t "Cenario 1: Teste de abrir navegador" estrutura.robot


# Executar vários arquivos de teste de uma vez
# Passo 1: criar uma pasta e colocar todos os arquivos que desejo executar dentro dela
# robot -d results NomeDaPastaOndeEstaoOsArquivosParaSeremTestados
# robot -d result Tests


# FOMRA DE EXECUÇÃO PERSONALIZADA
# Vamos supor que eu desejo executar o teste "Cenario 1: Teste de abrir navegador" do
# arquivos "estrutura.robot" ao mesmo tempo que quero executar o teste "Cenario 1: 
# Executar video no youtube" do arquivo "bdd.robot". Para isso, vamos usar o recurso de
# tags, onde iremos adicionar tags aos cenários de teste que desejamos executar e depois
# executar todos os cenários que possuem aquela tag
# EXEMPLO
# ---estrutura.robot---
# Cenario 1: Teste de abrir navegador
    [tags]    NomeDaTag
    Open Browser    https://www.google.com.br/?hl=pt-BR    chrome
    Close Browser

    ---bdd.robot---
    Cenario 1: Executar video no youtube
    [tags]    NomeDaTag
     Dado que eu acesso o site do youtube
     Quando digito o nome da música
     E clico no botão buscar
     E clico na primeira opção da lista
     Então o vídeo é executado
    
No teminal: robot -d results -i NomeDaTag NomeDaPastaOndeEstaoOsArquivosParaSeremTestados
robot -d results -i regressivo Tests