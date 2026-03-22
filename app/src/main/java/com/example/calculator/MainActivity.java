// MainActivity.java
package com.example.calculator;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // --- Déclaration des composants de l'interface ---
    private EditText etSuperficie, etChambres;
    private CheckBox cbJardin;
    private TextView tvBase, tvSupplement, tvMontant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // --- Liaison entre le XML et le code Java ---
        etSuperficie  = findViewById(R.id.et_superficie);
        etChambres    = findViewById(R.id.et_chambres);
        cbJardin      = findViewById(R.id.cb_jardin);
        tvBase        = findViewById(R.id.tv_base);
        tvSupplement  = findViewById(R.id.tv_supplement);
        tvMontant     = findViewById(R.id.tv_montant);

        // --- Clic sur le bouton "Estimer la taxe" ---
        findViewById(R.id.btn_estimer).setOnClickListener(v -> estimerTaxe());
    }

    /**
     * Calcule et affiche la taxe d'habitation en 3 lignes :
     *   Ligne 1 — Taxe de base    : superficie × 3.5
     *   Ligne 2 — Supplément      : chambres × 75 + jardin ? 150 : 0
     *   Ligne 3 — Taxe totale     : base + supplément
     */
    private void estimerTaxe() {

        // Lecture et conversion des saisies utilisateur
        double superficie  = Double.parseDouble(etSuperficie.getText().toString());
        int    nbChambres  = Integer.parseInt(etChambres.getText().toString());
        boolean avecJardin = cbJardin.isChecked();

        // Calcul des composantes
        double taxeBase     = superficie * 3.5;
        double supplement   = nbChambres * 75 + (avecJardin ? 150.0 : 0.0);
        double montantTotal = taxeBase + supplement;

        // Affichage sur 3 lignes séparées
        tvBase.setText("Taxe de base : " + taxeBase + " DH");
        tvSupplement.setText("Taxe supplémentaire : " + supplement + " DH");
        tvMontant.setText("Taxe totale : " + montantTotal + " DH");
    }
}