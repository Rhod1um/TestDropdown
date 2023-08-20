console.log("er i fetchBook")
const urlActivity = "http://localhost:8080/books" //skal hente fra egen database, kalder getmapping endpoint her
let activityList = []

window.addEventListener("load", loadActivity)

async function loadActivity(){
    activityList = await fetchAny(urlActivity);
    console.log(activityList)
    activityList.forEach(createActivityTable)
}

function fetchAny(url) {
    console.log(url)
    return fetch(url).then((response) => response.json())
}

function createActivityTable(book) {
    console.log("creating table " + book)
    if (!book.bookId) return;

    let cellCount = 0
    let rowCount = tblBook.rows.length
    let row = tblBook.insertRow(rowCount)
    row.id = book.bookId;

    let cell = row.insertCell(cellCount++)
    cell.innerHTML = book.bookId

    cell = row.insertCell(cellCount++)
    cell.innerHTML = book.title
}