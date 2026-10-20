.class public final Lz4/b;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lq8/i;

.field public final d:Lq8/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/b;->a:Landroid/content/Context;

    const-string p1, "EncryptedPrefs"

    iput-object p1, p0, Lz4/b;->b:Ljava/lang/String;

    new-instance p1, Lz4/a;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lz4/a;-><init>(Lz4/b;I)V

    new-instance v1, Lq8/i;

    invoke-direct {v1, p1}, Lq8/i;-><init>(Lc9/a;)V

    iput-object v1, p0, Lz4/b;->c:Lq8/i;

    new-instance p1, Lz4/a;

    const/4 v1, 0x0

    invoke-direct {p1, p0, v1}, Lz4/a;-><init>(Lz4/b;I)V

    new-instance v1, Lq8/i;

    invoke-direct {v1, p1}, Lq8/i;-><init>(Lc9/a;)V

    iput-object v1, p0, Lz4/b;->d:Lq8/i;

    invoke-virtual {p0}, Lz4/b;->a()Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v1, "sec_app_language"

    const-string v2, "en"

    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    invoke-static {v2}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    invoke-virtual {p0}, Lz4/b;->a()Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v1, "sec_master_filter_enabled"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    return-void
.end method


# virtual methods
.method public final a()Landroid/content/SharedPreferences;
    .locals 2

    iget-object v0, p0, Lz4/b;->d:Lq8/i;

    invoke-virtual {v0}, Lq8/i;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    const-string v0, "json"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lz4/b;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "sec_location_filters"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method
