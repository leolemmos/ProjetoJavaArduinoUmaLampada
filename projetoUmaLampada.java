// Código de Funcionamento do projeto
// Controle de Lâmpadas via Relé e Interruptor Paralelo com Arduino
 
const int SinalRele = 2;   // Pino de Sinal do Relé no Digital 2
char caractere;            // Nomeia variável caractere
 
void setup() {
  pinMode(SinalRele, OUTPUT);       // Define Pino Digital 2 como saída
  digitalWrite(SinalRele, HIGH);    // Inicia Pino Digital 2 em HIGH
  Serial.begin(9600);               // Inicia comunicação em 9600
}

void loop() {
 
  if (Serial.available()) {
    caractere = Serial.read();
    Serial.print("Caractere Recebido: ");   // Imprime a frase no monitor serial
    Serial.println(caractere);              // Imprime o caractere recebido
 
    if (caractere == 'a') {            // Se receber o caractere a ...
      digitalWrite(SinalRele, LOW);    // Altera Pino Digital 2 para LOW
    }
    if (caractere == 's') {            // Se receber o caractere s ...
      digitalWrite(SinalRele, HIGH);   // Altera Pino Digital 2 para HIGH
    }
  }
}
