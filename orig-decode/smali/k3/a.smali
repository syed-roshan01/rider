.class public final Lk3/a;
.super Lx9/v;


# instance fields
.field public final n:Landroid/widget/EditText;

.field public final o:Lk3/i;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lx9/v;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lk3/a;->n:Landroid/widget/EditText;

    new-instance v0, Lk3/i;

    invoke-direct {v0, p1}, Lk3/i;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, Lk3/a;->o:Lk3/i;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    sget-object v0, Lk3/c;->b:Lk3/c;

    if-nez v0, :cond_1

    sget-object v0, Lk3/c;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lk3/c;->b:Lk3/c;

    if-nez v1, :cond_0

    new-instance v1, Lk3/c;

    invoke-direct {v1}, Landroid/text/Editable$Factory;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v2, "android.text.DynamicLayout$ChangeWatcher"

    const-class v3, Lk3/c;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    sput-object v2, Lk3/c;->c:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :try_start_2
    sput-object v1, Lk3/c;->b:Lk3/c;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_1
    :goto_2
    sget-object v0, Lk3/c;->b:Lk3/c;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    return-void
.end method


# virtual methods
.method public final E(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    instance-of v0, p1, Lk3/d;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lk3/d;

    iget-object v1, p0, Lk3/a;->n:Landroid/widget/EditText;

    invoke-direct {v0, v1, p1, p2}, Lk3/d;-><init>(Landroid/widget/EditText;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    return-object v0
.end method

.method public final I(Z)V
    .locals 5

    iget-object v0, p0, Lk3/a;->o:Lk3/i;

    iget-boolean v1, v0, Lk3/i;->d:Z

    if-eq v1, p1, :cond_1

    iget-object v1, v0, Lk3/i;->c:Ll/q2;

    if-eqz v1, :cond_0

    invoke-static {}, Li3/l;->a()Li3/l;

    move-result-object v1

    iget-object v2, v0, Lk3/i;->c:Ll/q2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "initCallback cannot be null"

    invoke-static {v2, v3}, Lo1/s;->l(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Li3/l;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v1, v1, Li3/l;->b:Lq/g;

    invoke-virtual {v1, v2}, Lq/g;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_0
    :goto_0
    iput-boolean p1, v0, Lk3/i;->d:Z

    if-eqz p1, :cond_1

    invoke-static {}, Li3/l;->a()Li3/l;

    move-result-object p1

    invoke-virtual {p1}, Li3/l;->b()I

    move-result p1

    iget-object v0, v0, Lk3/i;->a:Landroid/widget/EditText;

    invoke-static {v0, p1}, Lk3/i;->a(Landroid/widget/EditText;I)V

    :cond_1
    return-void
.end method

.method public final u(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    instance-of v0, p1, Lk3/f;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    if-eqz v0, :cond_2

    return-object p1

    :cond_2
    new-instance v0, Lk3/f;

    invoke-direct {v0, p1}, Lk3/f;-><init>(Landroid/text/method/KeyListener;)V

    return-object v0
.end method
