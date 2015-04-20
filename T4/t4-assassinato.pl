% T4 - resolver um assassinato.

esteve(pedro,sm,segunda).
esteve(pedro,sm,terca).
esteve(pedro,poa,quarta).
esteve(pedro,sm,quinta).
esteve(pedro,apartamento,seXta).

esteve(caren,poa,segunda).
esteve(caren,poa,terca).
esteve(caren,poa,quarta).
esteve(caren,sm,quinta).
esteve(caren,apartamento,seXta).

esteve(henrique,apartamento,segunda).
esteve(henrique,poa,terca).
esteve(henrique,apartamento,quarta).
esteve(henrique,apartamento,quinta).
esteve(henrique,apartamento,seXta).

esteve(bia,apartamento,segunda).
esteve(bia,poa,terca).
esteve(bia,poa,quarta).
esteve(bia,sm,quinta).
esteve(bia,apartamento,seXta).

esteve(adriano,apartamento,segunda).
esteve(adriano,apartamento,terca).
esteve(adriano,sm,quarta).
esteve(adriano,apartamento,quinta).
esteve(adriano,apartamento,seXta).

esteve(alice,apartamento,segunda).
esteve(alice,poa,terca).
esteve(alice,poa,quarta).
esteve(alice,apartamento,quinta).
esteve(alice,apartamento,seXta).

esteve(bernardo,sm,segunda).
esteve(bernardo,sm,terca).
esteve(bernardo,poa,quarta).
esteve(bernardo,sm,quinta).
esteve(bernardo,apartamento,seXta).

esteve(maria,apartamento,segunda).
esteve(maria,sm,terca).
esteve(maria,sm,quarta).
esteve(maria,sm,quinta).
esteve(maria,apartamento,seXta).

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

relacionamento(bernardo,anita).
relacionamento(caren,bernardo).
relacionamento(pedro,anita).
relacionamento(alice,pedro).
relacionamento(henrique,alice).
relacionamento(maria,henrique).
relacionamento(adriano,maria).
relacionamento(caren,adriano).

motivo(X) :- ciumes(X,anita);insanidade(X);dinheiro(X).

ciumes(X,Y) :- relacionamento(X,A),relacionamento(Y,A).
insanidade(X):-insano(X).
dinheiro(X):-pobre(X).

acesso(X):- local(X), roubouchave(X), roubouarma(X).

local(X):- esteve(X,apartamento,quinta); esteve(X,apartamento,seXta).
roubouchave(X):- esteve(X,sm,segunda); esteve(X,poa,terca).
roubouarma(X):- bastao(X);martelo(X).

bastao(X):- esteve(X,poa,quinta); esteve(X,sm,quarta).
martelo(X):- esteve(X,apartamento,quarta); esteve(X,apartamento,quinta).

assassino(X):- motivo(X), acesso(X).






