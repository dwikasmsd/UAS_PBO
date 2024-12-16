module Main {
    requires java.sql;           // Menambahkan dukungan untuk modul java.sql
    requires javafx.controls;    // Dukungan untuk JavaFX Controls
    requires javafx.fxml;        // Dukungan untuk JavaFX FXML
    requires java.base;

    // Jika Anda menggunakan refleksi untuk JavaFX FXML, tambahkan berikut ini:
    opens Main to javafx.fxml;

    // Ekspor paket utama Anda:
    exports Main;
}
