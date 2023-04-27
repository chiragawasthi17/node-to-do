job('job dsl new2')
{
    description('this is our first job dsl using apache groovy')
    scm
    {
        git("https://github.com/chiragawasthi17/cv.git", 'main')
    }
    triggers
    {
        scm('* * * * *')
    }
    steps
    {
        shell('docker build -t chirag . && docker run -itd --name chirag -p 8887:80 chirag && sleep 1m && docker stop chirag && docker rm chirag && docker rmi chirag')
    }
}
