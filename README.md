# teste-estag-canais

Olá! Para seguirmos com o nosso processo seletivo para o nosso programa de estágio, precisamos que você solucione o problema de lógica abaixo:

Primeiro, clone essa branch na sua máquina e crie uma outra branch com seu nome a partir dela. Ex.: teste/joao_da_silva

A partir de uma entrada de arquivo TXT, como o contido neste repositório, com dados no seguinte formato: 

 "{\"id_transferencia\":1,\"valor_transferencia\":\"500\",\"tipo_transferencia\":\"PIX\",\"nome_emissor\":\"joao\",\"agencia_emissor\":\"001\",\"conta_emissor\":\"1234\",\"cpf_emissor\":\"123.123.123-12\",\"nome_receptor\":\"maria\",\"agencia_receptor\":\"002\",\"conta_receptor\":\"1335\",\"cpf_receptor\":\"112.113.114-15\"}" 

Desenvolva um algoritmo que execute operações de transferência bancária obedecendo os seguintes critérios: 

1. Toda transferência deverá ser feita entre um emissor e um receptor;
2. As transferências deverão ser executadas de acordo com o seu tipo, sendo 3 os tipos de transferência: PIX, TED e DOC;
3. O limite de valor máximo permitido para uma transferência via PIX é de R$ 5 mil; 
4. Transferências via TED só são permitidas para valores a acima de R$ 5 mil; 
5. Transferências via DOC só são permitidas para valores acima de R$ 10 mil; 
6. Não serão permitidas transferências de um emissor para ele mesmo nem para uma mesma conta; 

Escolha a linguagem na qual se sentir mais confortável em desenvolver o algortimo e pense nos casos de teste descritos acima! 

Ao finalizar o seu desafio, crie um pull request para essa branch, seguindo o passo a passo descrito no link - https://www.webdevdrops.com/como-criar-um-pull-request-no-github-passo-a-passo/

Boa sorte! 

