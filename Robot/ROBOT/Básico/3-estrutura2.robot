*** Settings ***
Library    SeleniumLibrary

*** Variables ***
#nome da variável    valor da variável
${variavel1}    teste
${variavel2}    hhhh

*** Keywords ***
#Keyword contém outras keywords
Abrir navegador
    Open Browser    https://www.google.com.br/?hl=pt-BR    chrome

Fechar navegador
    Close Browser

Abrir site selenium
    Open Browser    https://robotframework.org/SeleniumLibrary/SeleniumLibrary.html#Close%20Browser    chrome

*** Test Cases ***
Cenario 1: Teste de abrir navegador
    Abrir navegador
    Fechar navegador

Cenario 2: Abrir site do selenium
    Abrir site selenium
    Fechar navegador

