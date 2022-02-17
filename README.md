# projetoJavaArduinoUmaLampada
Projeto Arduíno ligando uma lâmpada via Bluetooth pelo celular.

Controle de Lâmpadas via Relé e Interruptor Paralelo é um procedimento pouco compreendido, mas de extrema importância para quem deseja realizar a automação de sua residência para controlar as lâmpadas através de um aplicativo sem perder o uso do interruptor e manter as duas possibilidades.

<img src="https://www.usinainfo.com.br/blog/wp-content/uploads/2021/09/projeto-interruptr-paralelo-rele-1-768x499.jpg"></a>

É normal nos depararmos com diversos problemas durante o desenvolvimento de projetos por não entendermos a mecânica de funcionamento de alguns produtos e não conhecermos outros componentes tão fundamentais para o sucesso do nosso projeto.

Um exemplo clássico que confunde muito a cabeça de hobistas que estão iniciando é a instalação de relés para controle de lâmpadas, uma vez que para mantermos o controle em paralelo com o interruptor é necessário trabalharmos com um modelo específico de Interruptor.

 

Se eu incluir um relé na lâmpada, como fica o interruptor?
Esta é a questão principal deste artigo, se incluirmos um relé para o controle de uma lâmpada, infelizmente o nosso interruptor tradicionalmente utilizado em instalações elétricas residências se torna obsoleto, pois conseguirá conciliar o seu trabalho com o trabalho do módulo relé, por isto, é que utilizamos um Interruptor Paralelo para isto.

 

</h3>Interruptor Paralelo</h3>
Os interruptores são dispositivos amplamente utilizados para o controle de liga e desliga de diversos equipamentos e dispositivos e uma das suas aplicações mais tradicionais está nas instalações residências, onde o mesmo controla as lâmpadas e demais equipamentos associados aos mesmos.

Na nossa casa estamos acostumados a encontrar as tradicionais tomadas unipolares, utilizada para controlar um ponto de luz de um único local, porém existe outro tipo de interruptor utilizado para controlar o ponto de luz de dois lugares diferentes e este é um interruptor paralelo.

 

<h3>O que é um Interruptor Paralelo?</h3>
O interruptor paralelo é um interruptor de três vias também conhecido como Three-Way ou Interruptor hotel que possibilita controlar uma lâmpada de dois locais diferentes, no início e fim de uma escadaria ou corredor, por exemplo, ou como vemos em hotéis com um interruptor na entrada no quarto e outro ao lado da cama.

 

<h3>Qual a diferença de um interruptor paralelo para um simples?</h3>
A diferença destes dois modelos é bem fácil de compreender e visualizar, os interruptores simples que utilizamos possuem em sua estrutura terminais para instalação de dois fios enquanto que o paralelo possui terminal para a instalação de três fios.

 

O sistema de funcionamento de dois interruptores paralelos é extremamente simples, o que inviabiliza a execução ou substituição destes terminais é a instalação elétrica, que precisa ser pensada e esquematizada antes mesmo de iniciar o projeto, abaixo podemos observar esta ligação.



<img src="https://www.usinainfo.com.br/blog/wp-content/uploads/2021/09/ligacao-interruptor-paralelo.fw_-768x384.png"></a>


Como podemos ver, a ligação do terminal da esquerda está conectado ao seu respectivo e a ligação do terminal da direita também está conectado com o seu respectivo, ficando o terminal central de cada interruptor com uma função específica.

Entendendo o sistema de ligação dos interruptores, o próximo passo é entender um pouco melhor como funciona o sistema de acionamento dos interruptores e quando é que as luzes estão ligadas ou desligadas.

Quando ambos os interruptores estiverem em uma mesma posição, seja ambos para baixo ou ambos para cima, a nossa lâmpada será ligada, porém quando os interruptores estiverem em posições diferentes, a lâmpada será desligada, fazendo com que ambos os interruptores controlem a luz de forma independente, veja:


<img src="https://www.usinainfo.com.br/blog/wp-content/uploads/2021/09/ligacao-interruptor-paralelo-com-rele.fw_-768x384.png"></a>


Para quem trabalha com eletrônica e conhece um pouco mais sobre as simbologias e ligações com relés deve ter notado a semelhança que temos no último esquema de ligação com este componente.

 

É possível trocar um Interruptor Paralelo por um Relé?
Sim, assim como é fácil observarmos a relação entre os esquemas de ligação do relé com o interruptor paralelo, também é visível a semelhança física entre os terminais do interruptor e das saídas de um módulo relé, por exemplo.

 

Controle de Lâmpada via Relé e Interruptor Paralelo
O controle de lâmpadas que integra um interruptor paralelo e um relé é a melhor opção para quem quer automatizar a sua casa sem se tornar preso a algum equipamento eletrônico ou controle específico para acionamento.

Assim como mencionado na pergunta anterior, o esquema de ligação dos componentes é semelhante ao já utilizado anteriormente para os dois interruptores, veja:


<img src="https://www.usinainfo.com.br/blog/wp-content/uploads/2021/09/interruptor-paralelo-615x289.jpg"></a>


om este esquema de ligação poderemos controlar tanto via Arduino quanto via interruptor residencial o acionar das lâmpadas e o controle da luz de forma fácil e simultânea, sem tirar a independência de nenhum dos dois dispositivos.

<img src=" https://www.usinainfo.com.br/blog/wp-content/uploads/2021/09/acionamento-interruptor-paralelo.fw_-768x435.png"></a>


 <h3>Produtos Utilizados no Teste</h3>
 
– Placa Uno R3 Arduino + Cabo USB;

– Módulo Bluetooth HC-05 Arduino – Master/Slave;

– Módulo Relé 5V 10A 1 Canal – JQC3FF;

– Jumpers;

– Interruptor Paralelo

– Soquete para Lâmpada

– Lâmpada

 

<h3>Esquema de Ligação para Controle de Lâmpada</h3>
O esquema de ligação do Controle de Lâmpada via Interruptor Paralelo e Relé é um projeto de simples conexão, mas que precisa de muito cuidado, por se tratar de um projeto que faz uso de redes de alta tensão.

Como já mencionado, a maior dificuldade realmente é a instalação elétrica via canaletas ou tubulação, principalmente se o procedimento for de substituição de interruptor simples, uma vez que a inclusão do relé em redes com interruptor paralelo não seria tão complexa.

Como podemos ver, neste passo, incluímos ao projeto, um Módulo Bluetoth para controle de acionamento do relé sem fio e realizamos as devidas ligações para o êxito do projeto com Arduino.

<h3>Link Aplicativo: Arduino bluetooth controller</h3>

Porém o que impulsionou a escolha por este aplicativo é uma função específica e simples que disponibiliza apenas um botão ON/OFF para controle de envio de dados e possibilita a fácil distinção do caractere desejado.

Para entendermos um pouco mais o sistema de funcionamento do aplicativo, separei alguns prints com o passo a passo para conexão e configuração. Assim que abrirmos o aplicativo, teremos a disposição todos os equipamentos bluetooth já pareados e os disponível para parear, como vemos abaixo:


<img src="https://www.usinainfo.com.br/blog/wp-content/uploads/2021/09/ligacao-interruptor-paralelo-com-rele.fw_-768x384.png"></a>

Lembrando que diferente da maioria dos aplicativos, este permite parear diretamente através do seu sistema. Após selecionar o dispositivo utilizado ele abrirá uma janela com as funções disponíveis e selecionaremos então a segunda opção, Switch mode.


<img src="https://www.usinainfo.com.br/blog/wp-content/uploads/2021/09/esquema-de-ligacao-controle-lempada-via-arduino.fw_-1024x1024.png "></a>

Depois que tiver selecionado o modo de trabalho do aplicativo, chegou a hora de configurar o caractere que será enviado ao Arduino sempre que tocar na tela do celular e enviar sinal ao microcontrolador. Para isto, basta apertar na engrenagem localizada no canto superior direito e digitar no campo de texto ao lado de cada símbolo o caractere identificado no código.

 <img src="https://www.usinainfo.com.br/blog/wp-content/uploads/2021/09/selecao-do-dispositivo-bluetooth.fw_-1-768x544.png"></a>

<h3>Conclusão,</h3>

O projeto de controle de Lâmpada com interruptor paralelo é utilizado em diversas instalações, porém conhecido mais profissionais da área e não por hobbistas que sofrem na instalação de seus projetos via relé, por exemplo, uma vez que fica totalmente dependente do dispositivo eletrônica e não possui meios mecânicos de acionamento.

Não existem segredos para o desenvolvimento deste projeto, mas é sempre bom lembrar que é necessário ter cuidado redobrado por estarmos trabalhando com redes elétricas de alta tensão que podem causar danos físicos ou causar danos patrimoniais quando mal manuseada.

Uma desvantagem deste projeto é que o mesmo não possui verificador de tensão, ou seja, não tem como dar um retorno ao dispositivo se a luz está ligada ou desligada, sem o feedback fica complicado o controle externo, por exemplo, e é um item que vale ser trabalhado para melhorar a eficiência do nosso projeto.

Não se esqueça de deixar o seu comentário dizendo o que achou do projeto e compartilhando duas experiências e dicas para quem deseja desenvolver também, este projeto.

