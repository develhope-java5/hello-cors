# Argomenti trattati
- Configurazione per richieste CORS su Spring
- Generazione di JWT su Spring

# Esercizio 1
Sostituire il controllo password banale in AuthenticationController con una ricerca in un database di utenti, in cui vengono salvati username e password.

# Esercizio 2
Aggiungere un JwtTokenFilter che blocchi richieste che non contengono un header "Authentication".
Nel caso in cui l'header sia presente e contenga un token. estrarre le informazioni li contenute ed aggiungerle alla richiesta come attributi.

# Esercizio 3
Sfruttare gli attributi aggiunti dal filtro implementato nell'esercizio 2 per proteggere Hello Controller. Fare in modo che solo utenti con il claim HELLO possano accedere all'endpoint /custom.