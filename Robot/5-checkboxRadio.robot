*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${radio_group}    optionsRadios
${checkbox_1}     id:monday
${checkbox_2}     id:thursday

*** Keywords ***
Abrir site
    Open Browser    https://itera-qa.azurewebsites.net/home/automation    chrome

Seleciona radio
    Select Radio Button    ${radio_group}    option2

Seleciona checkbox
    Select Checkbox    ${checkbox_1}
    Select Checkbox    ${checkbox_2}

Fechar navegador
    Close Browser

*** Test Cases ***
Cenario 1: Abrir site
    Abrir site

Cenario 2: Selecionar Radio Buttons
    Seleciona radio

Cenario 3: Selecionar checkboxes
    Seleciona checkbox

Cenario 4: Fechar site
    Fechar navegador
