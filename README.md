
## 🧠 Objectifs pédagogiques

- ✅ Définir une classe de base `BankAccount` avec les attributs `account` et `balance`
- ✅ Créer des classes enfants :
  - `CheckingAccount` (compte courant)
  - `SavingsAccount` (compte épargne)
  - `COD` (certificat de dépôt)
- ✅ Créer un constructeur dans chaque classe
- ✅ Accéder aux attributs hérités depuis `Main`
- ✅ Organiser le code avec un **package Java** `ci.pigier`

## 🧱 Détail des classes

| Classe            | Hérite de     | Attributs additionnels |
|------------------|---------------|-------------------------|
| `BankAccount`     | -             | `account`, `balance`   |
| `CheckingAccount` | `BankAccount` | `limit`                |
| `SavingsAccount`  | `BankAccount` | `interestRate`         |
| `COD`             | `BankAccount` | `duration`             |

## 💻 Exécution

###  Compilation

Assurez-vous que vous êtes dans le dossier parent de `ci/`, puis tapez :

```bash
javac ci/pigier/*.java

java ci.pigier.Main
