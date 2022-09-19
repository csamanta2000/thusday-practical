let flag = 0;
function controller(x)
{
    flag += x;
    slideshow(flag);
}
function slideshow(flag)
{
    let slides = document.getElementsByClassName('slide');
    if(flag == slides.length)
        {
            flag = 0;
        }
    if(flag < 0)
        {
            flag = slides.length-1;
        }
    for(let i of slides)
        {
            i.style.display = "none";
        }
    slides[flag].style.display = "block";
}
slideshow(flag);