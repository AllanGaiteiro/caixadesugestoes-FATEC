insert into tipo_sugestao (descricao) values 
('Comentário'),
('Crítica'),
('Elogio'),
('Sugestão');

insert into curso (nome)
values
('SIS INT'),
('DEV MUL'),
('ADM');

insert into sugestao (autor, conteudo, data, id_curso, id_tiposugestao)
values
('Andre Silva', 'Eu odeio programação. Eu odeio programação. Eu odeio programação. Eu odeio programação. Funcionou! Eu amo programação', now(), 1, 4),
('Antonia Medeiros', 'Eu gosto de prgramar... O Front End!' , now(), 1, 1),
('José Silva', 'Gostei muito das aulas Flutter, ele deveria ter sido inventado muito antes!. ', now(), 2, 3),
('Enzo Silva', 'Vamos criar um Discord para compartilhar conteúdo, experiências e conhecimentos sobre desenvolvimento?', now(), 2, 2);