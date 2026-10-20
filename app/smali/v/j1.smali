.class public final Lv/j1;
.super Lw8/c;


# instance fields
.field public a:Lv/l1;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lv/l1;

.field public d:I


# direct methods
.method public constructor <init>(Lv/l1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/j1;->c:Lv/l1;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lv/j1;->b:Ljava/lang/Object;

    iget p1, p0, Lv/j1;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv/j1;->d:I

    iget-object p1, p0, Lv/j1;->c:Lv/l1;

    invoke-virtual {p1, p0}, Lv/l1;->a(Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
