
fectchDatafunction();
async function  fectchDatafunction() {
    const fetchData = await fetch('https://jsonplaceholder.typicode.com/todos');
    data = await fetchData.json();
    console.log(data);
}


const [count, setCount] = useState();
useEffect(()=>{

},[count]);


