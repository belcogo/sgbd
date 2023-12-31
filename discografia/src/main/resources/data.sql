-- Artistas
INSERT INTO ARTISTAS (NOME_COMPLETO, NOME_ARTISTICO, BIO) VALUES ('Taylor Alisson Swift', 'Taylor Swift', 'Cantora e compositora de sucesso global com um estilo musical diversificado.');
INSERT INTO ARTISTAS (NOME_COMPLETO, NOME_ARTISTICO, BIO) VALUES ('Edward Christopher Sheeran MBE', 'Ed Sheeran', 'Cantor, compositor e músico britânico amplamente conhecido e uma figura proeminente na indústria da música');
INSERT INTO ARTISTAS (NOME_COMPLETO, NOME_ARTISTICO, BIO) VALUES ('Justin Drew Bieber', 'Justin Bieber', 'Cantor e compositor canadense que ganhou fama internacional na adolescência e continua a ser um dos artistas mais populares da música pop.');
INSERT INTO ARTISTAS (NOME_COMPLETO, NOME_ARTISTICO, BIO) VALUES ('Ariana Grande-Butera', 'Ariana Grande', 'Cantora e atriz conhecida por sua voz poderosa e cativante, com uma lista de hits de sucesso em sua carreira.');

-- Gravadoras
INSERT INTO GRAVADORAS (NOME, ENDERECO_MATRIZ) VALUES ('Big Machine Records', 'Nashville, TN'); -- ID: 1
INSERT INTO GRAVADORAS (NOME, ENDERECO_MATRIZ) VALUES ('Republic Records', 'New York, NY'); -- ID: 2
INSERT INTO GRAVADORAS (NOME, ENDERECO_MATRIZ) VALUES ('Epic Records', 'New York, NY'); -- ID: 3
INSERT INTO GRAVADORAS (NOME, ENDERECO_MATRIZ) VALUES ('Def Jam Recordings', 'New York, NY'); -- ID: 4
INSERT INTO GRAVADORAS (NOME, ENDERECO_MATRIZ) VALUES ('Atlantic Records', 'New York, NY'); -- ID: 5

-- Produtoras
INSERT INTO PRODUTORAS (NOME, ENDERECO_MATRIZ) VALUES ('Taylor Swift', 'Nashville, TN'); -- ID: 1
INSERT INTO PRODUTORAS (NOME, ENDERECO_MATRIZ) VALUES ('DJ Khaled', 'New York, NY'); -- ID: 2
INSERT INTO PRODUTORAS (NOME, ENDERECO_MATRIZ) VALUES ('Louis Bell', 'New York, NY'); -- ID: 3
INSERT INTO PRODUTORAS (NOME, ENDERECO_MATRIZ) VALUES ('Scooter Braun', 'New York, NY'); -- ID: 4
INSERT INTO PRODUTORAS (NOME, ENDERECO_MATRIZ) VALUES ('Justin Bieber', 'New York, NY'); -- ID: 5
INSERT INTO PRODUTORAS (NOME, ENDERECO_MATRIZ) VALUES ('Max Martin', 'New York, NY'); -- ID: 6

-- Discografias
INSERT INTO DISCOGRAFIAS (TITULO, BIO, TIPO, ID_GRAVADORA, ID_PRODUTORA) VALUES ('1989', 'Album Taylor Swift', 'ALBUM', 1, 1); -- Album, ID: 1
INSERT INTO DISCOGRAFIAS (TITULO, BIO, TIPO, ID_GRAVADORA, ID_PRODUTORA) VALUES ('Fearless (Taylors Version)', 'Album Taylor Swift', 'ALBUM', 2, 1); -- Album, ID: 2
INSERT INTO DISCOGRAFIAS (TITULO, BIO, TIPO, ID_GRAVADORA, ID_PRODUTORA) VALUES ('No Brainer', 'Musica Justin Bieber', 'SINGLE', 3, 2); -- Single, ID: 3
INSERT INTO DISCOGRAFIAS (TITULO, BIO, TIPO, ID_GRAVADORA, ID_PRODUTORA) VALUES ('Justice', 'Album Justin Bieber', 'ALBUM', 4, 3); -- Album, ID: 4
INSERT INTO DISCOGRAFIAS (TITULO, BIO, TIPO, ID_GRAVADORA, ID_PRODUTORA) VALUES ('Stuck With U', 'Musica Justin Bieber e Ariana Grande', 'SINGLE', 4, 4); -- Single, ID: 5
INSERT INTO DISCOGRAFIAS (TITULO, BIO, TIPO, ID_GRAVADORA, ID_PRODUTORA) VALUES ('Purpose', 'Album Justin Bieber', 'ALBUM', 4, 5); -- Album, ID: 6
INSERT INTO DISCOGRAFIAS (TITULO, BIO, TIPO, ID_GRAVADORA, ID_PRODUTORA) VALUES ('Eyes Closed', 'Musica Ed Sheeran', 'SINGLE', 5, 6); -- Single, ID: 6

-- Lancamento
INSERT INTO LANCAMENTOS (DATA, PLATAFORMAS, ID_DISCOGRAFIA) VALUES ('2014-10-27', 'CD, Streaming', 1); -- 1989
INSERT INTO LANCAMENTOS (DATA, PLATAFORMAS, ID_DISCOGRAFIA) VALUES ('2021-04-09', 'CD, Streaming', 2); -- Fearless (Taylors Version)
INSERT INTO LANCAMENTOS (DATA, PLATAFORMAS, ID_DISCOGRAFIA) VALUES ('2019-05-17', 'Streaming', 3); -- No Brainer
INSERT INTO LANCAMENTOS (DATA, PLATAFORMAS, ID_DISCOGRAFIA) VALUES ('2021-03-19', 'CD, Streaming', 4); -- Justice
INSERT INTO LANCAMENTOS (DATA, PLATAFORMAS, ID_DISCOGRAFIA) VALUES ('2020-05-08', 'CD, Streaming', 5); -- Stuck With U
INSERT INTO LANCAMENTOS (DATA, PLATAFORMAS, ID_DISCOGRAFIA) VALUES ('2015-11-13', 'CD, Streaming', 6); -- Purpose
INSERT INTO LANCAMENTOS (DATA, PLATAFORMAS, ID_DISCOGRAFIA) VALUES ('2023-03-24', 'Streaming', 7); -- Eyes Closed

-- Generos
INSERT INTO GENEROS (NOME) VALUES ('Pop');
INSERT INTO GENEROS (NOME) VALUES ('Country pop');
INSERT INTO GENEROS (NOME) VALUES ('R&B');
INSERT INTO GENEROS (NOME) VALUES ('Folk-pop');

-- Musicas
INSERT INTO MUSICAS (NOME, TEMPO, ID_GENERO, ID_DISCOGRAFIA) VALUES ('Welcome to New York', '3:32', 1,1); -- ID: 1
INSERT INTO MUSICAS (NOME, TEMPO, ID_GENERO, ID_DISCOGRAFIA) VALUES ('Blank Space', '3:51', 1,1); -- ID: 2
INSERT INTO MUSICAS (NOME, TEMPO, ID_GENERO, ID_DISCOGRAFIA) VALUES ('Fifteen', '4:54', 2,2); -- ID: 3
INSERT INTO MUSICAS (NOME, TEMPO, ID_GENERO, ID_DISCOGRAFIA) VALUES ('You Belong With Me', '3:51', 2,2); -- ID: 4
INSERT INTO MUSICAS (NOME, TEMPO, ID_GENERO, ID_DISCOGRAFIA) VALUES ('No Brainer', '4:20', 3,3); -- ID: 5
INSERT INTO MUSICAS (NOME, TEMPO, ID_GENERO, ID_DISCOGRAFIA) VALUES ('Peaches', '3:18', 1,4); -- ID: 6
INSERT INTO MUSICAS (NOME, TEMPO, ID_GENERO, ID_DISCOGRAFIA) VALUES ('Hold On', '2:51', 1,4); -- ID: 7
INSERT INTO MUSICAS (NOME, TEMPO, ID_GENERO, ID_DISCOGRAFIA) VALUES ('Stuck With U', '3:48', 1,5); -- ID: 8
INSERT INTO MUSICAS (NOME, TEMPO, ID_GENERO, ID_DISCOGRAFIA) VALUES ('Love Yourself', '3:52', 1,6); -- ID: 9
INSERT INTO MUSICAS (NOME, TEMPO, ID_GENERO, ID_DISCOGRAFIA) VALUES ('Eyes Closed', '3:11', 4,7); -- ID: 10

-- Funcao
INSERT INTO FUNCOES (TIPO, ID_MUSICA, ID_ARTISTA) VALUES ('CANTOR', 1, 1); -- Welcome to New York -> Taylor Swift
INSERT INTO FUNCOES (TIPO, ID_MUSICA, ID_ARTISTA) VALUES ('CANTOR', 2, 1); -- Blank Space -> Taylor Swift
INSERT INTO FUNCOES (TIPO, ID_MUSICA, ID_ARTISTA) VALUES ('CANTOR', 3, 1); -- Fifteen -> Taylor Swift
INSERT INTO FUNCOES (TIPO, ID_MUSICA, ID_ARTISTA) VALUES ('CANTOR', 4, 1); -- You Belong With Me -> Taylor Swift
INSERT INTO FUNCOES (TIPO, ID_MUSICA, ID_ARTISTA) VALUES ('CANTOR', 5, 3); -- No Brainer -> Justin Bieber
INSERT INTO FUNCOES (TIPO, ID_MUSICA, ID_ARTISTA) VALUES ('CANTOR', 6, 3); -- Peaches -> Justin Bieber
INSERT INTO FUNCOES (TIPO, ID_MUSICA, ID_ARTISTA) VALUES ('CANTOR', 7, 3); -- Hold On -> Justin Bieber
INSERT INTO FUNCOES (TIPO, ID_MUSICA, ID_ARTISTA) VALUES ('CANTOR', 8, 3); -- Stuck With U -> Justin Bieber
INSERT INTO FUNCOES (TIPO, ID_MUSICA, ID_ARTISTA) VALUES ('CANTOR', 8, 4); -- Stuck With U -> Ariana Grande
INSERT INTO FUNCOES (TIPO, ID_MUSICA, ID_ARTISTA) VALUES ('CANTOR', 9, 3); -- Love Yourself -> Justin Bieber
INSERT INTO FUNCOES (TIPO, ID_MUSICA, ID_ARTISTA) VALUES ('COMPOSITOR', 9, 2); -- Love Yourself -> Ed Sheeran
INSERT INTO FUNCOES (TIPO, ID_MUSICA, ID_ARTISTA) VALUES ('CANTOR', 10, 2); -- Eyes Closed -> Ed Sheeran