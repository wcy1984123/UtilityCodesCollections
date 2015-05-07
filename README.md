## Useful Links:


| Resources | Webpage Links |
| ------------- | --------------- |
| Apache Commons FileUpload | http://commons.apache.org/proper/commons-fileupload/using.html |
| Java Servlet Tutorial | http://www.w3cschool.cc/servlet/servlet-tutorial.html |
| Apache Ant Tutorial | http://www.tutorialspoint.com/ant/index.htm |
| JUnit | http://www.tutorialspoint.com/junit/junit_overview.htm |
| Tomcat Installation on Mac | http://www.himigame.com/java-servlet/845.html |
| Tomcat Configuration on Intellij | http://blog.csdn.net/little__zm/article/details/19569397 |
| Java Web Application using Tomcat on Intellij | http://blog.csdn.net/little__zm/article/details/19570535 |
| Javascript | http://www.w3cschool.cc/js/js-tutorial.html |
| PHP | http://www.w3cschool.cc/php/php-tutorial.html |
| CSS (Cascading Style Sheets) | http://www.w3cschool.cc/css/css-tutorial.html |
| JQuery| http://www.w3cschool.cc/jquery/jquery-tutorial.html |
| JSON (JavaScript Object Notation) | http://www.w3cschool.cc/json/json-tutorial.html |
| XML (Extensible Markup Language) | http://www.w3cschool.cc/xml/xml-tutorial.html |
| WSDL (Web Services Description Language) | WSDL 是基于 XML 的语言，用于描述 Web services 以及如何访问它们。|
|                                          | WSDL 可描述某个 web service，连同用于此 web service 的消息格式和协议细节。|
|                                          | http://www.w3cschool.cc/wsdl/wsdl-tutorial.html |
| SOAP (Simple Object Access protocol) | SOAP 是一种基于 XML 的简易协议，允许应用程序通过 HTTP 来交换信息。|
|                                      | 或者更简单地讲，SOAP 是用于访问 web 服务的协议。|
|                                      | http://www.w3cschool.cc/soap/soap-tutorial.html |
| Web Services | * 基础的 Web Services 平台是 **XML + HTTP**。|
|              | * HTTP 协议是最常用的因特网协议。|
|              | * XML 提供了一种可用于不同的平台和编程语言之间的语言。|
|              | * Web services 平台的元素：|
|              |   1. SOAP (简易对象访问协议)|
|              |   2. UDDI (通用描述、发现及整合)|
|              |   3. WSDL (Web services 描述语言)|
|              | * Web services 可把应用程序转换为网络应用程序（web-applications）。通过使用 XML，消息可在应用程序之间进行传送。|
|              |  http://www.w3cschool.cc/webservices/webservices-tutorial.html |
| AJAX (Asynchronous JavaScript and XML(异步的 JavaScript 和 XML))| http://www.w3cschool.cc/ajax/ajax-tutorial.html |
| Node.js | http://www.w3cschool.cc/nodejs/nodejs-tutorial.html |
| Linux & Shell | http://www.w3cschool.cc/linux/linux-tutorial.html |
| Tmux | 1. 在mac上如果要安裝tmux則需透過套件管理工具來處理安裝、升級跟移除。故需先安裝 **homebrew** 才能進行安裝. 根据http://brew.sh/进行安装**homebrew** |
|      | 2. 通过 **homebrew** 安装 tmux. 输入 **brew install tmux** |
|      | Tmux的使用方法和个性化配置 http://mingxinglai.com/cn/2012/09/tmux/ |
|      | 我的Tmux Conf 文件的解释: https://linuxtoy.org/archives/from-screen-to-tmux.html |
| Iterm2 | https://iterm2.com/index.html |
|        | Installation: Download it from the above link and put it in Applications|
|        | General Usage: https://iterm2.com/documentation-general-usage.html |
| Zsh | http://www.zsh.org/ |
|     | Installation: 安装**homebrew**, 然后通过**brew install zsh**命令安装 |
| Zsh 配置 | Color Theme: https://github.com/robbyrussell/oh-my-zsh/wiki/themes |
|         | oh-my-zsh: http://ohmyz.sh/ |
|         | oh-my-zsh on git hub: https://github.com/robbyrussell/oh-my-zsh |
|         | Installation: 先安装**homebrew**, 然后通过**brew install wget**安装 wget, 最后通过 **wget https://raw.github.com/robbyrussell/oh-my-zsh/master/tools/install.sh -O - \| sh** 安装on-my-zsh |
| Bash | http://www.tldp.org/LDP/Bash-Beginners-Guide/html/Bash-Beginners-Guide.html#chap_02 |
|      | Bash prompt basics: http://linuxconfig.org/bash-prompt-basics |
| Vim | http://www.vim.org/ |
|     | http://www.cs.swarthmore.edu/help/vim/home.html |
| Mac工作软件推荐－Iterm2 ＋ ZSH ＋ Tmux | http://www.wangyuxiong.com/archives/52137 |
| How to solve Tmux & Screen-256 TERM not supported on remote hosts? | 1.On the local system, dump the description to text format: |
|                                                      | **infocmp xterm-256color > xterm-256color.ti** |                                                   
|                                                      | **infocmp screen-256color > screen-256color.ti** |
|                                                      | 2.On the local system, copy to the remote host |
|                                                      | **scp xterm-256color.ti wangchiying@ccc.wpi.edu:** |                             
|                                                      | **scp screen-256color.ti wangchiying@ccc.wpi.edu:** |
|                                                      | 3.Go to the remote host and compile |
|                                                      | **tic xterm-256color.ti** |                             
|                                                      | **tic screen-256color.ti** |
|                                                      | http://superuser.com/questions/431922/tmux-and-screen-256-term-not-supported-on-remote-hosts |
|                                                      | http://karloluiten.nl/fix-terminal-entry-not-found-in-terminfo-screen-256color-not-known/ |
| How to use a vim color scheme?| http://alvinalexander.com/linux/vi-vim-editor-color-scheme-colorscheme |
|                               | https://github.com/altercation/vim-colors-solarized |
| Powerline on zsh, vim, tmux | http://lee-w-blog.logdown.com/posts/210946-powerline-on-zsh-vim-tmux |
|                             | See the following installation links in this webpage about powerline on zsh, vim, and tmux: |
|                             | 1. How to install powerline fonts? |
|                             | 2. How to install zsh powerline? |
|                             | 3. How to add a vim power line? |
|                             | 4. How to add a tmux power line? |
|                             | Before installing 2, 3, and 4, it must install 1 at first! |
| How to install powerline fonts? | Installation: |
|                                | 1. **git clone https://github.com/powerline/fonts.git** |
|                                | 2. Run **./install.sh** to install all Powerline Fonts|
|                                | 3. Change font in termianl such as **Terminal** or **Iterm2** to font with "powerline" extension |
|                                | https://github.com/powerline/fonts |
| How to install zsh powerline? | Installation: |
|                               | 1. **git clone https://github.com/jeremyFreeAgent/oh-my-zsh-powerline-theme.git** |
|                               | 2. Create a symlink of powerline.zsh-theme in .oh-my-zsh/themes/. You can use the install_in_omz.sh file: **./install_in_omz.sh** |
|                               | 3. Configure the theme in your .zshrc file: **ZSH_THEME="powerline"** |
|                               | https://github.com/jeremyFreeAgent/oh-my-zsh-powerline-theme |
| How to add a vim power line? | Installation: |
|                              | 1. **git clone https://github.com/bling/vim-airline ~/.vim/** |
|                              | 2. add **set laststatus=2** in .vimrc file. The default setting of 'laststatus' is for the statusline to not appear until a split is created. If you want it to appear all the time, add the above statement to your vimrc|
|                              | https://github.com/bling/vim-airline |
| How to add a tmux power line? | Installation: |
|                               | 1. **git clone https://github.com/erikw/tmux-powerline.git**|
|                               | 2. edit ~/.tmux.conf to use the following scripts:|
|                               |       set-option -g status on |
|                               |       set-option -g status-interval 2 |
|                               |       set-option -g status-utf8 on |
|                               |       set-option -g status-justify "centre" |
|                               |       set-option -g status-left-length 60 # set it by yourself |
|                               |       set-option -g status-right-length 90 # set if by yourself |
|                               |       set-option -g status-left "#(~/path/to/tmux-powerline/powerline.sh left)"      # set "/path/to" by yourself |
|                               |       set-option -g status-right "#(~/path/to/tmux-powerline/powerline.sh right)"    # set "/path/to" by yourself |
|                               |       bind C-[ run '~/path/to/tmux-powerline/mute_powerline.sh left'      # set "/path/to" by yourself # Mute left statusbar. |
|                               |       bind C-] run '~/path/to/tmux-powerline/mute_powerline.sh right'     # set "/path/to" by yourself # Mute right statusbar. |
|                               |       set-option -g status-right "#(~/path/to/tmux-powerline/powerline.sh right)"    # set "/path/to" by yourself |
|                               | 3. restart tmux by executing **tmux source-file .tmux.conf**      
|                               | 4. Add the following line to **.pwzshrc**|
|                               |       PS1="$PS1"'$([ -n "$TMUX" ] && tmux setenv TMUXPWD_$(tmux display -p "#D" | tr -d %) "$PWD")' |
|                               | 5. source .zshrc |
|                               | 6. Go to tmux-powerline directory and run **./generate_rc.sh** |
|                               | 7. Run **mv ~/.tmux-powerlinerc.default ~/.tmux-powerlinerc** |
|                               | 8. Edit .tmux-powerlinerc to enter your values |
|                               | 9. restart tmux by executing **tmux source-file .tmux.conf** 
|                               | https://github.com/erikw/tmux-powerline |
| GNU Screen | https://www.gnu.org/software/screen/ |
|            | Installation: 
|            | 1. 去官方网站下载最新源代码包(目前版本为4.0.3),解压缩 (http://ftp.gnu.org/gnu/screen/) |
|            | 2. configure;make;sudo make install; (http://blog.binchen.org/posts/jian-chi-shi-yong-gnu-screen.html) |
| Mercurial | http://mercurial.selenic.com/ |
|           | Installation: **brew install mercurial** (see link: http://mercurial.selenic.com/downloads)|
|           | Usage Guide: http://mercurial.selenic.com/wiki/Tutorial |
|           | HGRC Configuration Usage: http://www.selenic.com/mercurial/hgrc.5.html#ui |
| Arcanist (Code Review) | https://github.com/phacility/arcanist |
| git | http://git-scm.com/ |
|||
