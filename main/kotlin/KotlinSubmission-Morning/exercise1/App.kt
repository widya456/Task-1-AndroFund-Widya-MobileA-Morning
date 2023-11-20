package id.infinitelearning.KotlinSubmission.exercise1

import java.lang.reflect.Member

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Var
iable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Widya Indah Sari"
    val lastName: String = "Siregar"
    var age: Int = 20
    var status: Boolean = true
    println("Nama saya : $firstName $lastName")
    println("Umur saya : $age tahun")
    println("status ${if  (status) "Single" else "Tidak Single"}")

}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */

fun groupDetail(groupId: String, groupMember: List<Any>, session: String): String {
        val groupId = "Fifty-One"
        val groupMember = listOf("widya", "adelia", "afidz", "aqil", "aryanto", "nisya", "wulan", "dimas", "sultan", "rifqi")
        val session = "Pagi"
        println("group Id = $groupId")
        println("group Member = $groupMember")
        println("sesi = $session")
        return "Detail Group"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */

fun myTeam(member: List<String>): String {
    return member[0]
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */

fun totalMember(member: List<String>): Int {
    val mentor = listOf("Kak Budi Prayogo", "Kak Anisyah")
    println("mentor = $mentor")
    return mentor.size + member.size
}

fun main() {
    val ourMember = listOf<String>(
        "Widya Indah Sari Siregar",
        "Adelia Febriasari Harahap",
        "Afidz Bangun Prasetyo",
        "Muhammad Aqil Aziz",
        "Aryanto",
        "Annisa Ramadhani",
        "Wulan Annur",
        "Dimas Wahyu Mubarak",
        "Sultan Syekh Nuhly Rifa",
        "Rifqi Genta Buana"
    )

    myProfile()

    val myTeam = myTeam(ourMember)
    println("My team is: $ourMember")

    val totalMember = totalMember(ourMember)
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Fifty-One", (ourMember), "Pagi")

}