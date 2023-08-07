*** Variables ***
&{login}
#Elementos da página de registro
...    Input_PrimeiroNome=//input[@name="first_name"]
...    Input_UltimoNome=//input[@name="last_name"]
...    Input_Telefone=//input[@name="phone"]
...    btn_country=//button[@title="Select Country"]
...    Input_country=(//input[@class="form-control"])[3]
...    Input_Email=(//input[@name="email"])[1]
...    Input_Senha=//input[@name="password"]
...    Button_Signup=//button[@id="submitBTN"]
...    Button_captcha=//span[@class="recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox"]
#Elementos página de Login
...    Input_EmailLogin=//input[@id="email"] 
...    Input_SenhaLogin=//input[@id="password"] 
...    Button_Logar=//button[@id="submitBTN"]
...    A_OpcaoLogin=//a[@href="https://phptravels.net/login"]

