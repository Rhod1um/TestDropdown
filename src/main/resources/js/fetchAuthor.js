console.log("er i fetchAuthor")
const urlAuthor = "http://localhost:8080/authors" //skal hente fra egen database, kalder getmapping endpoint her
let authorList = []
const ddSelectAuthor = document.getElementById("ddSelectAuthor")

window.addEventListener("load", loadActivity)

async function loadActivity(){
    authorList = await fetchAny(urlAuthor);
    console.log(authorList)
    authorList.forEach(fillAuthorDropDown)
}

function fetchAny(url) {
    console.log(url)
    return fetch(url).then((response) => response.json())
}

function fillAuthorDropDown(author) {
    const el = document.createElement("option")
    console.log(el)
    el.value = author.authorId
    el.textContent = author.authorId + " " + author.name
    el.author = author //så reservation kan få hele activity object fra dropdown
    console.log(author.authorId)
    console.log(author)
    ddSelectAuthor.appendChild(el)
}