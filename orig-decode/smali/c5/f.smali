.class public final synthetic Lc5/f;
.super Ljava/lang/Object;


# instance fields
.field public final synthetic a:Lcom/auto/accept/ui/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/auto/accept/ui/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/f;->a:Lcom/auto/accept/ui/MainActivity;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    sget v0, Lcom/auto/accept/ui/MainActivity;->n:I

    iget-object v0, p0, Lc5/f;->a:Lcom/auto/accept/ui/MainActivity;

    const-string v1, "this$0"

    invoke-static {v0, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const-string p1, "Shizuku Permission Granted \u2713"

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_0
    const-string p1, "Shizuku Permission Denied \u2717"

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void
.end method
