% trabalho prolog para resolver um assassinato.

esteve(pedro,sm,segunda).
esteve(pedro,sm,terca).
esteve(pedro,poa,quarta).
esteve(pedro,sm,quinta).
esteve(pedro,apartamento,sexta).

esteve(caren,poa,segunda).
esteve(caren,poa,terca).
esteve(caren,poa,quarta).
esteve(caren,sm,quinta).
esteve(caren,apartamento,sexta).

esteve(henrique,apartamento,segunda).
esteve(henrique,poa,terca).
esteve(henrique,apartamento,quarta).
esteve(henrique,apartamento,quinta).
esteve(henrique,apartamento,sexta).

esteve(bia,apartamento,segunda).
esteve(bia,poa,terca).
esteve(bia,poa,quarta).
esteve(bia,sm,quinta).
esteve(bia,apartamento,sexta).

esteve(adriano,apartamento,segunda).
esteve(adriano,apartamento,terca).
esteve(adriano,sm,quarta).
esteve(adriano,apartamento,quinta).
esteve(adriano,apartamento,sexta).

esteve(alice,apartamento,segunda).
esteve(alice,poa,terca).
esteve(alice,poa,quarta).
esteve(alice,apartamento,quinta).
esteve(alice,apartamento,sexta).

esteve(bernardo,sm,segunda).
esteve(bernardo,sm,terca).
esteve(bernardo,poa,quarta).
esteve(bernardo,sm,quinta).
esteve(bernardo,apartamento,sexta).

esteve(maria,apartamento,segunda).
esteve(maria,sm,terca).
esteve(maria,sm,quarta).
esteve(maria,sm,quinta).
esteve(maria,apartamento,sexta).

insano(adriano).
insano(maria).

pobre(bia).
pobre(bernardo).
pobre(pedro).
pobre(maria).


relacionamento(anita,bernardo).
relacionamento(bernardo,caren).
relacionamento(anita,pedro).
relacionamento(pedro,alice).
relacionamento(alice,henrique).
relacionamento(henrique,maria).
relacionamento(maria,adriano).
relacionamento(adriano,caren).

vitima(anita).

assassino(x) :- motivo(x), acesso(x).

motivo(x) :- ciumes(x);insanidade(x);dinheiro(x).
ciumes(x) :- relacionamento(x,anita),relacionamento(y,anita) %REVER<<<<
insanidade(x):-insano(x).
dinheiro(x):-pobre(x).

acesso(x)....






