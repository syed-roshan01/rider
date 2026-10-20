.class public final Lz4/a;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lz4/b;


# direct methods
.method public synthetic constructor <init>(Lz4/b;I)V
    .locals 0

    iput p2, p0, Lz4/a;->a:I

    iput-object p1, p0, Lz4/a;->b:Lz4/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lz4/a;->a:I

    iget-object v1, p0, Lz4/a;->b:Lz4/b;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lc4/c;

    iget-object v1, v1, Lz4/b;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lc4/c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lc4/c;->b()V

    invoke-virtual {v0}, Lc4/c;->a()Lc4/d;

    move-result-object v0

    return-object v0

    :pswitch_0
    :try_start_0
    iget-object v0, v1, Lz4/b;->a:Landroid/content/Context;

    iget-object v2, v1, Lz4/b;->c:Lq8/i;

    invoke-virtual {v2}, Lq8/i;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc4/d;

    invoke-static {v0, v2}, Lc4/b;->a(Landroid/content/Context;Lc4/d;)Lc4/b;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v2, v1, Lz4/b;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v3, "EncryptedSharedPreferences creation failed, fallback to secure private prefs: "

    invoke-static {v3, v0, v2}, La7/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Lz4/b;->a:Landroid/content/Context;

    const-string v1, "encrypted_app_data_secure"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
