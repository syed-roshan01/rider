.class public final Lp9/a;
.super Lw8/c;


# instance fields
.field public a:Lq9/u;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:La4/c0;

.field public d:I


# direct methods
.method public constructor <init>(La4/c0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lp9/a;->c:La4/c0;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp9/a;->b:Ljava/lang/Object;

    iget p1, p0, Lp9/a;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp9/a;->d:I

    iget-object p1, p0, Lp9/a;->c:La4/c0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, La4/c0;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
