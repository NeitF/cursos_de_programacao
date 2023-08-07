*** Settings ***
Library    SeleniumLibrary

*** Variables ***
#nome da variável    valor da variável
${variavel1}    teste
${variavel2}    hhhh

*** Keywords ***


*** Test Cases ***
Cenario 1: Teste de abrir navegador
#Por boas práticas, não colocamos as Keywords da library diretamente no test case. A forma mais correta está
#exemplificada em 
    Open Browser    https://www.google.com.br/?hl=pt-BR    chrome
    Close Browser


Cenario 2: Teste de arir pagina do selenium
    Open Browser    https://robotframework.org/SeleniumLibrary/SeleniumLibrary.html#Open%20Browser    chrome
    Close Browser