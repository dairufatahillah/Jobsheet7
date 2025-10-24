# Jobsheet7

## Percobaan 1

### Pertanyaan:

1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!

2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?

3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!

4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang    lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah!

### Jawab:

1. Inisialisasi int i = 0, kondisi i < 10, increment i++

2. nilai tertinggi 0 karena nilai harus lebih besar dari semua inputan, dan sebalik nya. jika hasilnya dibalik akan salah karena nilai tertinggi nya selalu 100 dan nilai terendahnya 0.

3. Program meminta 10 nilai mahasiswa, lalu mencari nilai tertinggi dan nilai terendah dengan membandingkan setiap input terhadap nilai sebelumnya, kemudian menampilkan hasilnya.

4. SUDAH

## Percobaan 2

### Pertanyaan:

1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut: 
    a. nilai < 0 || nilai > 100 
    b. continue

2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?

3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?

4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!

### Jawab:

1. Maksud dari potongan code ini adalah

    a. Mengecek apakah nilai di luar rentang kurang dari 0 atau lebih dari 100. Jika iya, dianggap tidak valid dan jika tidak maka valid.

    b. Melewati sisa code dalam perulangan saat ini dan langsung lanjut ke iterasi berikutnya.

2. Karena i++ menandakan bahwa setelah satu data valid dimasukkan, baru perulangan pindah ke mahasiswa berikutnya.

3. Perulangan WHILE akan berjalan 19 kali (selama i < 19 bernilai true).

4. Sudah

## Percobaan 3

### Pertanyaan:

1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan?

2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!

3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?

4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?

### Jawab:

1. Perulangan tetap berjalan sekali, karena pada do-while blok code dijalankan dulu baru dicek kondisinya.

2. Kondisi berhentinya adalah saat pengguna mengetik “batal”, yang memicu break di dalam perulangan.

3. true membuat perulangan berjalan terus sampai ada perintah break yang menghentikannya.

4. Karena kondisi perulangan selalu true, jadi tidak butuh variabel penghitung i untuk mengontrol loop.