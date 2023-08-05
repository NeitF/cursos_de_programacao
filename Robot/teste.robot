*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${URL}    https://phptravels.net/#
${btn_account}    (//a[@href="#"])[3]
${btn_account2}    //a[@href="https://phptravels.net/signup"]

*** Keywords ***
Abre site
    Open Browser    ${URL}    chrome

Clica no btn
    Click Link    ${btn_account}
    Click Link    ${btn_account2}

*** Test Cases ***
Cena 1:
    Abre site
    Clica no btn
