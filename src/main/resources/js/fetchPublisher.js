console.log("er i fetchPublisher")
const urlPublisher = "http://localhost:8080/publishers" //skal hente fra egen database, kalder getmapping endpoint her
let publishList = []
const ddSelectPublisher = document.getElementById("ddSelectPublisher")

window.addEventListener("load", loadActivity)

async function loadActivity(){
    publishList = await fetchAny(urlPublisher);
    console.log(publishList)
    publishList.forEach(fillActivityDropDown)
}

function fetchAny(url) {
    console.log(url)
    return fetch(url).then((response) => response.json())
}

function fillActivityDropDown(activity) {
    const el = document.createElement("option")
    console.log(el)
    el.value = activity.publisherId
    el.textContent = activity.publisherId + " " + activity.name
    el.publisher = activity //så reservation kan få hele activity object fra dropdown
    console.log(activity.publisherId)
    console.log(activity)
    ddSelectPublisher.appendChild(el)
}