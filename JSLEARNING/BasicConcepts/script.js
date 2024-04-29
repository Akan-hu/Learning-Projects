const url = 'https://cat-fact.herokuapp.com/facts'

const getFacts = async () => {
  console.log('getting data please wait...')
  let response = await fetch(url)
  console.log(response)
}
