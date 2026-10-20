.class public final Ll9/c;
.super Ljava/lang/Object;

# interfaces
.implements Lk9/i;


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:I

.field public final d:Lc9/e;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILf5/f0;)V
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/c;->a:Ljava/lang/CharSequence;

    iput p2, p0, Ll9/c;->b:I

    iput p3, p0, Ll9/c;->c:I

    iput-object p4, p0, Ll9/c;->d:Lc9/e;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Ll9/b;

    invoke-direct {v0, p0}, Ll9/b;-><init>(Ll9/c;)V

    return-object v0
.end method
