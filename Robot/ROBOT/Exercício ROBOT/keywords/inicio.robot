*** Settings ***
Resource    ../Settings/settings.resource

*** Keywords ***
Dado que eu acesse o php travels
    Open Browser  ${URL}  ${Browser}
    Maximize Browser Window
