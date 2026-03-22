# 🏡 Calculateur de Taxe d'Habitation — Android

Application Android permettant d'estimer la taxe d'habitation d'un logement en fonction de ses caractéristiques.

---

## 📱 Aperçu




https://github.com/user-attachments/assets/91060aee-ef6a-4d31-ae65-e6e3f1d88db4


L'application calcule et affiche en temps réel :
- La **taxe de base** selon la superficie
- La **taxe supplémentaire** selon le nombre de chambres et la présence d'un jardin
- Le **montant total** de la taxe d'habitation

---


## ✨ Fonctionnalités

- Saisie de la superficie du logement (en m²)
- Saisie du nombre de chambres
- Option jardin privé (case à cocher)
- Affichage détaillé du calcul en 3 lignes

---

## 🧮 Formule de calcul

```
Taxe de base        = superficie × 3.5
Taxe supplémentaire = (nombre de chambres × 75) + (jardin ? 150 : 0)
Taxe totale         = Taxe de base + Taxe supplémentaire
```

### Exemple
| Champ      | Valeur |
|-------     |--------|
| Superficie | 120 m² |
| Chambres   | 4      |
| Jardin     | ✅     |
| **Taxe de base**  | **420.0 DH** |
| **Supplément**    | **450.0 DH** |
| **Total**         | **870.0 DH** |

---

## 🛠️ Technologies utilisées

- **Langage** : Java
- **IDE** : Android Studio
- **SDK minimum** : API 21 (Android 5.0)
- **Interface** : XML (LinearLayout)

---

## 📂 Structure du projet

```
app/
└── src/
    └── main/
        ├── java/com/example/calculator/
        │   └── MainActivity.java
        └── res/
            └── layout/
                └── activity_main.xml
```

---

## 🚀 Installation

1. Clone le dépôt :
```bash
git clone https://github.com/lakbita-khadija/LAB2_taxe-habitation.git
```
2. Ouvre le projet dans **Android Studio**
3. Lance l'application sur un émulateur ou un appareil Android

---

## 👨‍💻 Auteur

**Khadijalakbita** — TP Android · Lab Calculateur d'impôts locaux
