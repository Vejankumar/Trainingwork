let timeOut = (timeOutInMills = 2000,message  ="Default Message") => {
    setTimeout((msg)=> {
        console.log(`${msg} executed after ${timeOutInMills} second.`)
    }, timeOutInMills*1000, message)
}

let timeOutInterval = (timeOutInMills = 2000,message  ="Default Message") => {
    handle=setInterval((msg)=> {
        console.log(`${msg} executed after ${timeOutInMills} second.`)
    }, timeOutInMills*1000, message)
}


//timeOut(5,"First Asynchronous programm !!");
timeOutInterval(1,"Called after every Second");
console.log("This message will be executed even before the timeout is completed");


setTimeout(()=> {
    console.log('Lets terminate the interval ..')
    clearInterval(handle)} , 5000);