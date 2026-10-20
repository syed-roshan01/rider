.class public final Lo2/f;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lm0/g1;Lm0/d1;Lm0/f1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lo2/f;->a:I

    iput-object p1, p0, Lo2/f;->c:Ljava/lang/Object;

    iput-object p2, p0, Lo2/f;->b:Ljava/lang/Object;

    iput-object p3, p0, Lo2/f;->d:Ljava/lang/Object;

    iput-object p4, p0, Lo2/f;->e:Ljava/lang/Object;

    iput-object p5, p0, Lo2/f;->f:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p6, p0, Lo2/f;->a:I

    iput-object p1, p0, Lo2/f;->c:Ljava/lang/Object;

    iput-object p2, p0, Lo2/f;->d:Ljava/lang/Object;

    iput-object p3, p0, Lo2/f;->e:Ljava/lang/Object;

    iput-object p4, p0, Lo2/f;->b:Ljava/lang/Object;

    iput-object p5, p0, Lo2/f;->f:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lo2/f;->a:I

    packed-switch v1, :pswitch_data_0

    .line 1
    invoke-virtual {p0}, Lo2/f;->invoke()V

    return-object v0

    .line 2
    :pswitch_0
    invoke-virtual {p0}, Lo2/f;->invoke()V

    return-object v0

    .line 3
    :pswitch_1
    invoke-virtual {p0}, Lo2/f;->invoke()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke()V
    .locals 7

    iget v0, p0, Lo2/f;->a:I

    const/4 v1, 0x1

    iget-object v2, p0, Lo2/f;->d:Ljava/lang/Object;

    iget-object v3, p0, Lo2/f;->f:Ljava/lang/Object;

    iget-object v4, p0, Lo2/f;->b:Ljava/lang/Object;

    iget-object v5, p0, Lo2/f;->c:Ljava/lang/Object;

    iget-object v6, p0, Lo2/f;->e:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v6, Lm0/g1;

    check-cast v5, Ld5/p1;

    .line 4
    iget-object v0, v5, Ld5/p1;->a:Ljava/lang/String;

    .line 5
    invoke-interface {v6, v0}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    check-cast v4, Lm0/l3;

    .line 6
    invoke-interface {v4}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/auto/accept/data/model/CouponData;

    if-eqz v0, :cond_0

    check-cast v3, Lm0/g1;

    .line 7
    invoke-interface {v3}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 8
    invoke-static {v0}, Ll9/i;->R0(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    check-cast v2, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    .line 9
    invoke-interface {v3}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 10
    invoke-static {v0}, Ll9/i;->o1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, v5, Ld5/p1;->a:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->u(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void

    :pswitch_0
    check-cast v2, Lm0/g1;

    .line 11
    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 12
    invoke-interface {v2, v0}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    check-cast v6, Lm0/d1;

    check-cast v6, Lm0/s2;

    const/4 v0, 0x0

    .line 13
    invoke-virtual {v6, v0}, Lm0/s2;->f(F)V

    check-cast v3, Lm0/f1;

    check-cast v5, Landroid/content/Context;

    check-cast v4, Ljava/lang/String;

    .line 14
    :try_start_0
    new-instance v0, Ljava/io/File;

    sget-object v2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {v5, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {v5}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    const-string v6, "updates"

    invoke-direct {v0, v2, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 15
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 16
    :cond_2
    new-instance v2, Ljava/io/File;

    const-string v6, "AutoAccept-update.apk"

    invoke-direct {v2, v0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 17
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 18
    :cond_3
    new-instance v0, Landroid/app/DownloadManager$Request;

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V

    const-string v4, "AcceptPro Update"

    .line 19
    invoke-virtual {v0, v4}, Landroid/app/DownloadManager$Request;->setTitle(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    move-result-object v0

    const-string v4, "Downloading latest version..."

    .line 20
    invoke-virtual {v0, v4}, Landroid/app/DownloadManager$Request;->setDescription(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    move-result-object v0

    .line 21
    invoke-virtual {v0, v1}, Landroid/app/DownloadManager$Request;->setNotificationVisibility(I)Landroid/app/DownloadManager$Request;

    move-result-object v0

    .line 22
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/app/DownloadManager$Request;->setDestinationUri(Landroid/net/Uri;)Landroid/app/DownloadManager$Request;

    move-result-object v0

    .line 23
    invoke-virtual {v0, v1}, Landroid/app/DownloadManager$Request;->setAllowedOverMetered(Z)Landroid/app/DownloadManager$Request;

    move-result-object v0

    .line 24
    invoke-virtual {v0, v1}, Landroid/app/DownloadManager$Request;->setAllowedOverRoaming(Z)Landroid/app/DownloadManager$Request;

    move-result-object v0

    const-string v2, "download"

    .line 25
    invoke-virtual {v5, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type android.app.DownloadManager"

    invoke-static {v2, v4}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/app/DownloadManager;

    .line 26
    invoke-virtual {v2, v0}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 27
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Download error: "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "ForceUpdateScreen"

    invoke-static {v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Download failed: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    const-wide/16 v0, -0x1

    :goto_2
    check-cast v3, Lm0/w2;

    .line 29
    invoke-virtual {v3, v0, v1}, Lm0/w2;->f(J)V

    :cond_4
    return-void

    :pswitch_1
    check-cast v5, Lo2/r;

    check-cast v2, Lc9/a;

    check-cast v6, Lo2/u;

    check-cast v4, Ljava/lang/String;

    check-cast v3, Lm2/l;

    .line 30
    invoke-virtual {v5, v2, v6, v4, v3}, Lo2/r;->i(Lc9/a;Lo2/u;Ljava/lang/String;Lm2/l;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
